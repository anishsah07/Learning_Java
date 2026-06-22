import java.util.Scanner;

class Employee {
    String name;
    String empId;
    


    public void details() {
        System.out.println("ID : " + empId);
        System.out.println("Name: " + name);
        

    }
}


class Teacher extends Employee{
    String sub;

    @Override
    public void details() {
        super.details();
        System.out.println("Subject: "  + sub);
    }

}

class Adminstaff extends Employee{
    String dep;

    @Override
    public void details() {
        super.details();
        System.out.println("Department:" + dep);
        
    }

}



public class Uni_employes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select employee Type:");
        System.out.println("1.Teacher Staff \n2.Administrative Staff"); 
        int choice = scanner.nextInt();
        scanner.nextLine();


        System.out.println("enter Employee name ");
        String name = scanner.nextLine();

        System.out.println("Enter employee id ");
        String empId = scanner.nextLine();

        if (choice == 1 ){
            System.out.println("Enter the subject name ");
            String sub = scanner.nextLine();
            
            System.out.println("Teacher Details ");
           Teacher teacher = new Teacher ();
           teacher.empId = empId;
           teacher.name = name ;
           teacher.sub = sub;
           teacher.details();


        }

        else if (choice ==2 ){
            System.out.println("Enter the department");
            String dep = scanner.nextLine();
            System.out.println("Admin staff");
            Adminstaff admin = new Adminstaff();
            admin.empId = empId;
            admin.name = name ;
            admin.dep = dep;

            admin.details();

        }

        else {
            System.out.println("Wrong choice of option");
        }

       
        scanner.close();
    }
}