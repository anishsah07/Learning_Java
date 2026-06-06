import java.util.Scanner;

public class Fitness_Challenge_Tracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int totalsteps = 0;
        int higheststeps = 0;
        int days = 7;

        System.out.println("Fitness Tracker");
        
        
        
        for (int i = 1; i <= days; i++) {
            System.out.print("Enter Steps Walked on Day " + i + ":");
            int currentSteps = scanner.nextInt();

            totalsteps += currentSteps;

            if (currentSteps > higheststeps) {
                higheststeps = currentSteps;
            }
        }

        float averageSteps = totalsteps / (float)days;

        System.out.println("Total steps: " + totalsteps);
        System.out.println("Average steps: " + averageSteps);
        System.out.println("Highest number of steps: " + higheststeps);

        scanner.close();
    }
}
