import java.util.Scanner;

class Member {
    String name;
    String memberId;
    


    public void borrowLimit() {
        System.out.println("Standard limit: 1 book allowed");
        

    }
}


class StudentMember extends Member {
    @Override
    public void borrowLimit() {
        System.out.println("Student Borrow Limit: Max 3 books allowed for 14 days");
    }

}

class TeacherMember extends Member {
    @Override
    public void borrowLimit() {
        System.out.println("Teacher Borrow Limit: Max 10 books allowed for 30 days");
        
    }

}



public class Lib_member {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select Member Type:");
        System.out.println("1.Student Member \n2.Teacher Member"); 
        int choice = scanner.nextInt();
        scanner.nextLine();


        System.out.println("Enter member name ");
        String name = scanner.nextLine();

        System.out.println("Enter member id ");
        String memberId = scanner.nextLine();

        if (choice == 1 ){
            System.out.println("Library Card Details ");
            System.out.println("ID : " + memberId);
            System.out.println("Name: " + name);
            
            StudentMember student = new StudentMember();
            student.memberId = memberId;
            student.name = name;
            student.borrowLimit();


        }

        else if (choice == 2 ){
            System.out.println(" Library Card Details ");
            System.out.println("ID : " + memberId);
            System.out.println("Name: " + name);
            
            TeacherMember teacher = new TeacherMember();
            teacher.memberId = memberId;
            teacher.name = name;
            teacher.borrowLimit();

        }

        else {
            System.out.println("Wrong choice of option");
        }

       
        scanner.close();
    }
}