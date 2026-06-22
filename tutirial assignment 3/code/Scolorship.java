import java.util.Scanner;

abstract class Scholarship {
    String studentName;

    public abstract void checkEligibility();
}


class MeritScholarship extends Scholarship {
    float gpa;

    @Override
    public void checkEligibility() {
        System.out.println("Checking Merit Scholarship for: " + studentName);
        if (gpa >= 3.75) {
            System.out.println("Status: ELIGIBLE (GPA requirement met)");
        } else {
            System.out.println("Status: NOT ELIGIBLE (GPA must be 3.75 or above)");
        }
    }
}

class NeedBasedScholarship extends Scholarship {
    double annualIncome;

    @Override
    public void checkEligibility() {
        System.out.println("Checking Need-Based Scholarship for: " + studentName);
        if (annualIncome <= 40000) {
            System.out.println("Status: ELIGIBLE (Income requirement met)");
        } else {
            System.out.println("Status: NOT ELIGIBLE (Income exceeds threshold)");
        }
    }
}



public class Scolorship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select Scholarship Type:");
        System.out.println("1.Merit-Based Scholarship \n2.Need-Based Scholarship"); 
        int choice = scanner.nextInt();
        scanner.nextLine();


        System.out.println("Enter student name ");
        String name = scanner.nextLine();

        if (choice == 1) {
            System.out.println("Enter student GPA ");
            double studentGpa = scanner.nextDouble();
            
            System.out.println(" Scholarship System ");
            MeritScholarship merit = new MeritScholarship();
            merit.studentName = name;
            merit.gpa = (float) studentGpa;
            merit.checkEligibility();

        }

        else if (choice == 2) {
            System.out.println("Enter family annual income ");
            double income = scanner.nextDouble();
            
            System.out.println(" Scholarship System ");
            NeedBasedScholarship need = new NeedBasedScholarship();
            need.studentName = name;
            need.annualIncome = income;
            need.checkEligibility();

        }

        else {
            System.out.println("Wrong choice of option");
        }

       
        scanner.close();
    }
}