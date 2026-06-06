import java.util.Scanner;

public class Palindrome_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int x = scanner.nextInt();

        if (isPalindrome(x)) {
            System.out.println(x + " is a palindrome.");
        } else {
            System.out.println(x + " is NOT a palindrome.");
        }
        
        scanner.close();
    }

    public static boolean isPalindrome(int x) {
       
        if (x < 0) {
            return false;
        }

        int original = x;
        int reversed = 0;

       
        while (x != 0) {
            int pop = x % 10;
            reversed = (reversed * 10) + pop;
            x /= 10;
        }

       
        return original == reversed;
    }
}
