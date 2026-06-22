import java.util.Scanner;

class Attendance {
    String name;
    double totalClasses;
    double attendedClasses;
    


    public void calculateAttendance() {
        double percentage = (attendedClasses / totalClasses) * 100;
        System.out.println("General Attendance: " + percentage + "%");
        

    }
}


class EngineeringAttendance extends Attendance {
    @Override
    public void calculateAttendance() {
        double percentage = (attendedClasses / totalClasses) * 100;
        System.out.println("Engineering Attendance: " + percentage + "%");
        if (percentage >= 75) {
            System.out.println("Status: Eligible for Engineering Exams");
        } else {
            System.out.println("Status: Shortage of Attendance");
        }
    }

}

class MedicalAttendance extends Attendance {
    @Override
    public void calculateAttendance() {
        double percentage = (attendedClasses / totalClasses) * 100;
        System.out.println("Medical Attendance: " + percentage + "%");
        if (percentage >= 85) {
            System.out.println("Status: Eligible for Medical Exams & Rotations");
        } else {
            System.out.println("Status: Shortage of Attendance");
        }
        
    }

}



public class Att_calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select Faculty Type:");
        System.out.println("1.Engineering Faculty \n2.Medical Faculty"); 
        int choice = scanner.nextInt();
        scanner.nextLine();


        System.out.println("Enter student name ");
        String name = scanner.nextLine();

        System.out.println("Enter total number of classes ");
        double total = scanner.nextDouble();

        System.out.println("Enter attended number of classes ");
        double attended = scanner.nextDouble();

        if (choice == 1 ){
            System.out.println("--- Attendance Details ---");
            System.out.println("Name: " + name);
            
            EngineeringAttendance eng = new EngineeringAttendance();
            eng.name = name;
            eng.totalClasses = total;
            eng.attendedClasses = attended;
            eng.calculateAttendance();


        }

        else if (choice == 2 ){
            System.out.println("--- Attendance Details ---");
            System.out.println("Name: " + name);
            
            MedicalAttendance med = new MedicalAttendance();
            med.name = name;
            med.totalClasses = total;
            med.attendedClasses = attended;
            med.calculateAttendance();

        }

        else {
            System.out.println("Wrong choice of option");
        }

       
        scanner.close();
    }
}