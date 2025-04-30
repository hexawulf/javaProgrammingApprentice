package l04;
import java.util.Scanner;

public class LeapYearChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nLeap Year Checker Menu:");
            System.out.println("1. Check Leap Year");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");

            // Read the user's choice as a string first
            String choiceInput = scanner.nextLine(); 

            try {
                choice = Integer.parseInt(choiceInput); 

                switch (choice) {
                    case 1:
                        checkLeapYear(scanner); // Call the leap year checking function
                        break;
                    case 2:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                choice = 0; // Set choice to 0 to continue the loop
            }

        } while (choice != 2);
        scanner.close(); //close the scanner.
    }

    // Function to check leap year
    public static void checkLeapYear(Scanner scanner) {
        System.out.print("Enter a year: ");
        String input = scanner.nextLine();
        try {
            int year = Integer.parseInt(input);
            boolean isLeapYear = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
            if (isLeapYear) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid year (an integer).");
        }
    }
}