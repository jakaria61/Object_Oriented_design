public class Course  extends Semister{

    String courseTitle;
    String courseCode;


    void register(){
        System.out.println("Register done ");
    }
    void drop(){
        System.out.println("semister drop");
    }
    void withdraw(){
        System.out.println("Withdraw");
    }
    void courseInfromation(){
        System.out.println("courseTitle:"+courseTitle);
        System.out.println("courseCode:"+courseCode);
    }
}