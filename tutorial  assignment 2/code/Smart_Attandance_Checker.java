import java.util.Scanner;

public class Smart_Attandance_Checker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of classes conduct ");
        int cla = scanner.nextInt();

        System.out.println("Enter number of classes attend by student:");
        int att = scanner.nextInt();

        float per = ((float)att/cla)*100;

        System.out.println( per);


        if (per >= 75 && per <=100){
            System.out.println("Eligible for exam ");

        }
        else{
            System.out.println("not Eligible for exam");

        }

        scanner.close();
        
    }
}
