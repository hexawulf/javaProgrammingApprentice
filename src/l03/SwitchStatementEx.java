package l03;
import java.util.Scanner;

public class SwitchStatementEx {
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a day number (1-7): ");

        // Check if input is an integer
        if (scanner.hasNextInt()) {
            int day = scanner.nextInt();

            // Use switch statement to process the day
            switch(day) {
                case 1:
                    System.out.println("Today is Monday");
                    break;
                case 2:
                    System.out.println("Today is Tuesday");
                    break;
                case 3:
                    System.out.println("Today is Wednesday");
                    break;
                case 4:
                    System.out.println("Today is Thursday");
                    break;
                case 5:
                    System.out.println("Today is Friday");
                    break;
                case 6:
                    System.out.println("Today is Saturday");
                    break;
                case 7:
                    System.out.println("Today is Sunday");
                    break;
                default:
                    System.out.println("Invalid day number! Please enter a number between 1 and 7.");
            }
        } else {
            System.out.println("That's not a valid number!");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}