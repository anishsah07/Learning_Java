import java.util.Scanner;

class Student {
    String name;
    String studentId;
    static int idCounter = 1000; 
    


    public Student(String name) {
        this.name = name;
        idCounter++; 
        this.studentId = "STU" + idCounter; 

    }

    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Generated ID: " + studentId);
        

    }
}


public class Id_generoator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many students do you want to register? ");
        int totalStudents = scanner.nextInt();
        scanner.nextLine(); 


        for (int i = 0; i < totalStudents; i++) {
            System.out.println("\nEnter name for student " + (i + 1));
            String name = scanner.nextLine();
            
            Student s = new Student(name);
            System.out.println(" Student Registered");
            s.display();
        }

       
        scanner.close();
    }
}