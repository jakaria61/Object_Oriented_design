public class Student extends Semister {


    private String registrationNO;
    private  String Name;

    public String getRegistrationNO(){
        return registrationNO;
    }
    public void setRegistrationNo(String registrationNO){
        this.registrationNO=registrationNO;
    }
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name=Name;
    }
    void enroll(){
        System.out.println("You are enroll on this course.");
    }

    void displayInformation(){
        System.out.println("Student info:");
        System.out.println("Name:"+Name);
        System.out.println("Registration No:"+registrationNO);
    }
}
