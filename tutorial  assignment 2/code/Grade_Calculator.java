import java.util.Scanner;

public class Grade_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks obtained: ");
        double marks = scanner.nextDouble();
        if (marks < 100 && marks > 0 ){

            String grade = (marks >= 90) ? "A+" :
                        (marks >= 85) ? "A" :
                        (marks >= 80) ? "A-" :
                        (marks >= 75) ? "B+" :
                        (marks >= 70) ? "B" :
                        (marks >= 65) ? "B-" :
                        (marks >= 60) ? "C+" :
                        (marks >= 55) ? "C" :
                        (marks >= 50) ? "C-" : "Fail";

            System.out.println("Grade: " + grade);
        }
        else {
            System.out.println("incorrect mark ");
            
        }

        scanner.close();
    }
}
