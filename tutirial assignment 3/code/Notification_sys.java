import java.util.Scanner;

interface Notification {
    public void sendNotification();
}


class EmailNotification implements Notification {
    String emailAddress;
    String message;

    @Override
    public void sendNotification() {
        System.out.println("Sending Email to: " + emailAddress);
        System.out.println("Message Content: " + message);
        System.out.println("Status: Email sent successfully.");
    }
}

class SMSNotification implements Notification {
    String phoneNumber;
    String message;

    @Override
    public void sendNotification() {
        System.out.println("Sending SMS to: " + phoneNumber);
        System.out.println("Message Content: " + message);
        System.out.println("Status: SMS delivered successfully.");
        
    }
}



public class Notification_sys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select Notification Type:");
        System.out.println("1.Email Notification \n2.SMS Notification"); 
        int choice = scanner.nextInt();
        scanner.nextLine();


        System.out.println("Enter your message ");
        String msg = scanner.nextLine();

        if (choice == 1 ){
            System.out.println("Enter email address ");
            String email = scanner.nextLine();
            
            System.out.println(" Notification system ");
            EmailNotification emailNotify = new EmailNotification();
            emailNotify.emailAddress = email;
            emailNotify.message = msg;
            emailNotify.sendNotification();


        }

        else if (choice == 2 ){
            System.out.println("Enter phone number ");
            String phone = scanner.nextLine();
            
            System.out.println(" Notification system ");
            SMSNotification smsNotify = new SMSNotification();
            smsNotify.phoneNumber = phone;
            smsNotify.message = msg;
            smsNotify.sendNotification();

        }

        else {
            System.out.println("Wrong choice of option");
        }

       
        scanner.close();
    }
}