package genova.challenge.patientcompiler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.*;

/**
 *
 * @author Mike
 */
public class mainFrame extends javax.swing.JFrame {

    /**
     * Creates new form mainFrame
     */
    public mainFrame() {
        initComponents();
        this.setTitle("Coding Challenge");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputPane = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jspFiles = new javax.swing.JScrollPane();
        lstFiles = new javax.swing.JList<>();
        outputPane = new javax.swing.JPanel();
        jspOutputPane = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextPane();
        btnShowOutput = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAdd.setText("Add File(s)");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnClear.setText("Clear Files");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        mdlFileList = new DefaultListModel<File>();
        lstFiles.setModel(mdlFileList);
        lstFiles.setToolTipText("List of files to combine");
        jspFiles.setViewportView(lstFiles);

        javax.swing.GroupLayout inputPaneLayout = new javax.swing.GroupLayout(inputPane);
        inputPane.setLayout(inputPaneLayout);
        inputPaneLayout.setHorizontalGroup(
            inputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspFiles, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(inputPaneLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(btnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        inputPaneLayout.setVerticalGroup(
            inputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspFiles, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnClear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtOutput.setEditable(false);
        jspOutputPane.setViewportView(txtOutput);

        btnShowOutput.setText("Export Data");
        btnShowOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowOutputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout outputPaneLayout = new javax.swing.GroupLayout(outputPane);
        outputPane.setLayout(outputPaneLayout);
        outputPaneLayout.setHorizontalGroup(
            outputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, outputPaneLayout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addComponent(btnShowOutput)
                .addGap(145, 145, 145))
            .addGroup(outputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(outputPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jspOutputPane, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        outputPaneLayout.setVerticalGroup(
            outputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, outputPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnShowOutput)
                .addContainerGap())
            .addGroup(outputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(outputPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jspOutputPane, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                    .addGap(42, 42, 42)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(outputPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        JFileChooser jfcDir = new JFileChooser();
        jfcDir.setMultiSelectionEnabled(true);
        jfcDir.showOpenDialog(null);
        File[] files = jfcDir.getSelectedFiles();

        for(File file : files){
            if(!this.mdlFileList.contains(file)){
                this.mdlFileList.addElement(file);
                //System.out.println(((File)this.mdlFileList.get(0)).getAbsoluteFile());
            }else{
                JOptionPane.showMessageDialog(null,
                    file.getName() + " has already been added.",
                    "Warning",1);
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        this.mdlFileList.clear();
        this.txtOutput.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnShowOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowOutputActionPerformed
        this.txtOutput.setText("");
        ArrayList<Patient> patients = new ArrayList<Patient>();
        for(int i = 0; i < this.mdlFileList.size() ; i++){
            BufferedReader reader;

		try {
                    reader = new BufferedReader(new FileReader(((File)this.mdlFileList.get(i)).getAbsoluteFile()));

                    //First line should contain fname/lname/age row
                    String line = reader.readLine();
                    String[] spltLine = line.split("\t");

                    //determine order in file
                    int[] intOrder = this.getColumnOrder(spltLine);

                    //read first data line
                    line = reader.readLine();

                    while (line != null) {
                        //split data line and add new data to patient class
                        spltLine = line.split("\t");
                        patients.add(new Patient(intOrder, spltLine));

                        // read next line
                        line = reader.readLine();
                    }
                    reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
        }
        sort(patients);
        //add patients to output
        this.txtOutput.setText("lastname, firstname, age");
        for(Patient patient : patients){
            this.txtOutput.setText(this.txtOutput.getText() + "\n" 
                + patient.getLastName() + ", " 
                + patient.getFirstName() + ", " 
                + patient.getAge());
        }
        int dupes = countDuplicates(patients);
        int avgAge = (int)avgAge(patients);

        //exporting to csv file after removing leading spaces
        //use the saveFile method here if you do not wish to include the sentences below.
        //saveFile();

        this.txtOutput.setText(this.txtOutput.getText() + "\n\n"
            + "There were " + dupes + " incidences of duplicate first names" + "\n"
            + "The average age for both files was " + avgAge
        );

        //this includes the sentences above in the csv file
        //directions state to include the above
        saveFile();
    }//GEN-LAST:event_btnShowOutputActionPerformed

    public static void sort(ArrayList<Patient> list){
        list.sort(
            (o1, o2) -> o1.getLastName().compareTo(o2.getLastName())
        );
    }

    public double avgAge(ArrayList<Patient> list){
        int sum = 0;
        for(Patient patient : list){
            sum += patient.getAge();
        }
        double avg = (double)sum / list.size();
        //single point of precision
        double roundOff = Math.round(avg * 10.0) / 10.0;
        //rounded to nearest whole number
        roundOff = Math.round(roundOff);
        return roundOff;
    }

    public int countDuplicates(ArrayList<Patient> list){
        HashMap<String, Integer> myPair = new HashMap();
        int total = 0;
        for(Patient patient : list){
            String fName = patient.getFirstName();
            if(myPair.containsKey(fName)){
                //if this is the first instance of a duplicate, include original patient as an "instance"
                if(myPair.get(fName) == 0){total += 1;}
                myPair.put(fName, myPair.get(fName)+1 );
                //add instance of patient duplicate
                total += 1;
            }else{
                myPair.put(fName, 0);
            }
        }
        //this would be the alternate way to calculate duplicate instances
        //total is equal to the number of duplicates found + the # of keys with a value > 0
        
        return total;
    }

    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnShowOutput;
    private javax.swing.JPanel inputPane;
    private javax.swing.JScrollPane jspFiles;
    private javax.swing.JScrollPane jspOutputPane;
    private javax.swing.DefaultListModel mdlFileList;
    private javax.swing.JList<String> lstFiles;
    private javax.swing.JPanel outputPane;
    private javax.swing.JTextPane txtOutput;
    // End of variables declaration//GEN-END:variables

    private int[] getColumnOrder(String[] spltFirstLine) {
        int[] intOrder = new int[3];
        for(int x = 0; x < 3 ; x++){
            if(spltFirstLine[x].equals("First Name")){
                intOrder[1] = x;
            }if(spltFirstLine[x].equals("Last Name")){
                intOrder[0] = x;
            }if(spltFirstLine[x].equals("Age")){
                intOrder[2] = x;
            }
        }
        return intOrder;
    }

    private void saveFile() {
        JFileChooser jfcDir = new JFileChooser();
        jfcDir.setMultiSelectionEnabled(true);
        jfcDir.showSaveDialog(null);
        try{
            if(jfcDir.getSelectedFile().toString().contains(".csv")){
                FileWriter fw = new FileWriter(jfcDir.getSelectedFile());
                fw.write(this.txtOutput.getText().replaceAll(", ", ","));
                fw.close();
            }else{
                FileWriter fw = new FileWriter(jfcDir.getSelectedFile()+".csv");
                fw.write(this.txtOutput.getText().replaceAll(", ", ","));
                fw.close();
            }
        }catch(IOException e){
            System.out.println("IOException has occurred");
        }
    }
}
