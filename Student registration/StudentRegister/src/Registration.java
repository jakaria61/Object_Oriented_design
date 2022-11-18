import java.util.ArrayList;

public class Registration {
    public static void main(String[] args) {
        Student s=new Student();
        s.setName("Md jakaria");
        s.setRegistrationNo("1838520107");
        Student s1=new Student();
        s1.setName("Sumon pal");
        s1.setRegistrationNo("1838520116");
        Student s2=new Student();
        s2.setName("Ema ");
        s2.setRegistrationNo("1838520106");
        Student s3=new Student();
        s3.setName("Ayesga");
        s3.setRegistrationNo("1838520118");
        
        
        ArrayList <Student> students =new ArrayList<>();
        students.add(s);
       // students.add(s1);
       // students.add(s2);
       // students.add(s3);
        for (Student student : students) {
            student.displayInformation();
        }

        Course c=new Course();
        c.courseTitle="Object oriented design";
        c.courseCode="cse-4141";
        Course c1=new Course();
        c1.courseTitle="parallel processing";
        c1.courseCode="cse-4131";
        Course c2=new Course();
        c2.courseTitle="Digital image processing";
        c2.courseCode="cse-4181";

        ArrayList<Course>courses=new ArrayList<>();
        courses.add(c);
        courses.add(c1);
        courses.add(c2);
        for (Course course : courses) {
            course.courseInfromation();
           
        }
        System.out.println("Registration successful!");

    }
}
