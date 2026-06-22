import java.util.Scanner;

class StudentData {
    private String name;
    private int roll_no;
    private String faculty; 

    public StudentData(String name, int roll_no, String faculty) {
        this.name = name;
        this.roll_no = roll_no;
        this.faculty = faculty;
    }

    public String getname() {
        return name;
    }

    public int getroll_no() {
        return roll_no;
    }

    public String getfaculty() {
        return faculty;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setroll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public void setfaculty(String faculty) {
        this.faculty = faculty;
    }
}

public class info_student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Student name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Roll Number: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.print("Enter Faculty: ");
        String faculty = scanner.nextLine();
        
        StudentData student1 = new StudentData(name, rollNo, faculty);
        
        System.out.println("\n Student Details ");
        System.out.println("Name: " + student1.getname());
        System.out.println("Roll No: " + student1.getroll_no());
        System.out.println("Faculty: " + student1.getfaculty());
        
        scanner.close(); 
    }
}

