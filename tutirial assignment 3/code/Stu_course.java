import java.util.ArrayList;
import java.util.Scanner;

class Course {
    String C_name;
    
    public Course (String C_name){
        this.C_name = C_name;

    }
}


class Student{
    String name ;
    ArrayList<Course> reg_Courses;



    public Student(String name){
        this.name = name;
        this.reg_Courses = new ArrayList<>();


    }


    public void reg_course (Course course){
        reg_Courses.add(course);

    }



    public void dis_course(){
        System.out.println("Registered Courses for " + name   );
        if (reg_Courses.isEmpty()){
            System.out.println("No courses registered");

        }
        else {
            for (Course course : reg_Courses){
                System.out.println(course.C_name);
            }
        }
    }
}





public class Stu_course {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print ("Enter student name ");

        String name = scanner .nextLine();
        Student student = new Student(name);


        System.out.println("how many course you want ");
        int num = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0 ; i < num ; i++){
            System.out.println("Enter Course name " + (i+1) );
            String C_name = scanner.nextLine();
            Course course = new Course(C_name);
            student.reg_course(course);

            
        }

        student.dis_course();
        scanner.close();


    }
    
}