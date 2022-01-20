package genova.challenge.patientcompiler;

/**
 *
 * @author Mike
 */
public class Patient {
    private String fName;
    private String lName;
    private int age;

    public Patient(int[] order, String[] patientData){
        this.setLastName(patientData[order[0]]);
        this.setFirstName(patientData[order[1]]);
        this.setAge(Integer.parseInt(patientData[order[2]]));
    }

    public void setFirstName(String fName){
        this.fName = fName;
    }
    public void setLastName(String lName){
        this.lName = lName;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getFirstName(){
        return this.fName;
    }
    public String getLastName(){
        return this.lName;
    }
    public int getAge(){
        return this.age;
    }
    
}
