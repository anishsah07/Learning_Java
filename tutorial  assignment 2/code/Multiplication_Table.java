import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a number to print its multiplication table: ");
        int num = scanner.nextInt();

        System.out.println("\n Multiplication Table of " + num + " ");

        
        for (int i = 1; i <= 10; i++) {
            int product = num * i;
            System.out.println(num + " x " + i + " = " + product);
        }

        scanner.close();
    }
}
