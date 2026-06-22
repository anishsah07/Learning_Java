import java.util.Scanner;

interface ResultProcessor {
    public void processResult();
}


class EngineeringDepartment implements ResultProcessor {
    double examScore;
    double labScore;

    @Override
    public void processResult() {
        double finalGrade = (examScore * 0.7) + (labScore * 0.3);
        System.out.println("Engineering Grade: " + finalGrade);
    }
}

class ManagementDepartment implements ResultProcessor {
    double examScore;
    double assignmentScore;

    @Override
    public void processResult() {
        double finalGrade = (examScore * 0.6) + (assignmentScore * 0.4);
        System.out.println("Management Grade: " + finalGrade);
    }
}



public class Grade_calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select Department Type:");
        System.out.println("1.Engineering Department \n2.Management Department"); 
        int choice = scanner.nextInt();


        System.out.println("Enter the main exam score ");
        double exam = scanner.nextDouble();

        if (choice == 1 ){
            System.out.println("Enter lab practical score ");
            double lab = scanner.nextDouble();
            
            System.out.println(" Result details ");
            EngineeringDepartment eng = new EngineeringDepartment();
            eng.examScore = exam;
            eng.labScore = lab;
            eng.processResult();


        }

        else if (choice == 2 ){
            System.out.println("Enter assignment score ");
            double assignment = scanner.nextDouble();
            
            System.out.println(" Result details ");
            ManagementDepartment mgmt = new ManagementDepartment();
            mgmt.examScore = exam;
            mgmt.assignmentScore = assignment;
            mgmt.processResult();

        }

        else {
            System.out.println("Wrong choice of option");
        }

       
        scanner.close();
    }
}