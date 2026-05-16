public class OperatorDemo {
    public static void main(String[] args) {
        int a = 10, b = 3;

        // --- Arithmetic Operators ---
        System.out.println("Arithmetic Operators\n");
        System.out.println("a + b = " + (a + b) +
                           "\na % b = " + (a % b) +
                           "\n(a - b) = " + (a - b) +
                           "\n(a * b) = " + (a * b) +
                           "\n(a / b) = " + (a / b));

        // --- Relational Operators ---
        System.out.println("\nRelational Operators");
        System.out.println("a > b : " + (a > b) +
                           "\na < b : " + (a < b) +
                           "\na == b : " + (a == b) +
                           "\na != b : " + (a != b));

        // --- Logical Operators ---
        System.out.println("\nLogical Operators");
        boolean x = true;
        boolean y = false;
        System.out.println("x && y : " + (x && y) +
                           "\nx || y : " + (x || y) +
                           "\n!x : " + (!x));
    }
}
