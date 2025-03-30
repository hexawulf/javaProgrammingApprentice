package L03;

import java.util.Scanner; // Import the Scanner class

public class galtolit
{
    public static void main(String[] args)
    {
        double gallons;
        double liters;
        
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.println("Enter volume in gallons: ");
        
        // Read the input value
        gallons = scanner.nextDouble();
        
        // Convert to liters
        liters = gallons * 3.7854;
        
        // Display the result
        System.out.println(gallons + " gallons is " + liters + " liters.");
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}