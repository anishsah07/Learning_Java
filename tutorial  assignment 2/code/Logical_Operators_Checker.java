import java.util.Scanner;

public class Logical_Operators_Checker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

       
        boolean isSum = (num1 + num2 == num3);

       
        if (isSum) {
            System.out.println("Yes! " + num3 + " is the sum of " + num1 + " and " + num2 );
        } else {
            System.out.println("No! " + num3 + " is NOT the sum of " + num1 + " and " + num2 );
        }

        scanner.close();
    }
}
