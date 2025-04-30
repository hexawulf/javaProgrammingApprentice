package l06;

public class FunctionChallenge7 {

    public static void main(String[] args) {
        // Test the functions
        double F = 32.0;
        double C = 0.0;
        double F2CResult = F2C(F); // Renamed variable
        double C2FResult = C2F(C); // Renamed variable

        // Print the results
        System.out.println(F + " degrees Fahrenheit is " + F2CResult + " degrees Celsius.");
        System.out.println(C + " degrees Celsius is " + C2FResult + " degrees Fahrenheit.");
        System.out.println("The fourth root of " + F + " is " + fourthRoot(F) + ".");
        System.out.println("The fourth root of " + 81 + " is " + fourthRoot(81) + ".");
    }

    // Task 1: Fahrenheit to Celsius
    public static double F2C(double F) {
        return (5.0 / 9.0) * (F - 32);
    }

    // Task 2: Celsius to Fahrenheit
    public static double C2F(double C) {
        return (9.0 / 5.0) * C + 32;
    }

    // Task 3: Fourth root
    public static double fourthRoot(double x) {
        return Math.sqrt(Math.sqrt(x));
    }
}
