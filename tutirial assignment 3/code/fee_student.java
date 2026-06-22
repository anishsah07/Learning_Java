import java.util.Scanner;

abstract class Student {
    String name;
    String studentId;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public abstract double calculateFee();

    public void displayProfile() {
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Calculated Fee: " + calculateFee());
    }
}

class Undergraduate extends Student {
    int credits;

    public Undergraduate(String name, String studentId, int credits) {
        super(name, studentId);
        this.credits = credits;
    }

    @Override
    public double calculateFee() {
        return credits * 300.0;
    }
}

class Graduate extends Student {
    double labFee;

    public Graduate(String name, String studentId, double labFee) {
        super(name, studentId);
        this.labFee = labFee;
    }

    @Override
    public double calculateFee() {
        return 5000.0 + labFee;
    }
}

public class fee_student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Student Type:");
        System.out.println("1. Undergraduate\n2. Graduate");
        int choice = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();

        if (choice == 1) {
            System.out.print("Enter registered credits: ");
            int credits = Integer.parseInt(scanner.nextLine());
            
            Undergraduate ug = new Undergraduate(name, id, credits);
            System.out.println("\n Undergraduate Profile ");
            ug.displayProfile();
        } else if (choice == 2) {
            System.out.print("Enter laboratory research fee: ");
            double labFee = Double.parseDouble(scanner.nextLine());
            
            Graduate g = new Graduate(name, id, labFee);
            System.out.println("\n Graduate Profile ");
            g.displayProfile();
        } else {
            System.out.println("Invalid Selection.");
        }

        scanner.close();
    }
}