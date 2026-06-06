import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of terms (n) to print: ");
        int n = scanner.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;

  

        
        for (int i = 1; i <= n; i++) {
            System.out.println(firstTerm + " ");

          
            int nextTerm = firstTerm + secondTerm;
            
          
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        
        System.out.println(); 
        scanner.close();
    }
}
