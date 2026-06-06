import java.util.Scanner;

public class Prime_Number_Checker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check: ");
        int num = scanner.nextInt();

        boolean isPrime = true;

        
        if (num <= 1) {
            isPrime = false;
        } else {
           
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false; 
                    break;          
                }
            }
        }

      
        if (isPrime) {
            System.out.println(num + " is a PRIME number.");
        } else {
            System.out.println(num + " is NOT a PRIME number.");
        }

        scanner.close();
    }
}
