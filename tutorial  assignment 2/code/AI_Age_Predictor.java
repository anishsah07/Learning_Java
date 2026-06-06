import java.util.Scanner;

public class AI_Age_Predictor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter Your age ");
        int age = scanner.nextInt();

        int pre1 = age + 10 ;
        int pre2 = age + 25 ;
        int pre3 = age + 50 ;

        int time = 100 - age ;
        int  preyear = 2026 + time ;

        System.out.println("The age you will be after 10 years: " + pre1);
        System.out.println("The age you will be after 25 years: " + pre2);
        System.out.println("The age you will be after 50 years: " + pre3);
        System.out.println("You will turn 100 years old in the year: " + preyear);


        scanner.close();
        
    }
}
