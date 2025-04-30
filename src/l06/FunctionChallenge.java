package l06;

public class FunctionChallenge {

    public static void main(String[] args) {
        // Task 1:
        // Write the calculation for Fahrenheit to Celsius as a function
        // C = (5/9)(F - 32)
        // The header is: static double F2C (double F)
        
        // Task 2:
        // Write the calculation for Celsius to Fahrenheit as a function
        // F = (9/5)C + 32
        // The header is: static double C2F (double C)
    	
    	//Task 3:
    	// Calculate the fourth root of a number
    	// The header is: static double fourthRoot (double x)
        
    	//Task 4:
    	// Write a function that will cut off any numbers to the right of the second decimal place.
    	// Therefore, 3.14159 becomes 3.14
    	// The header is: static double cutoff	 (double x)
    	//Move the decimal point two places to the right, round to the nearest integer, then move the decimal point two places to the left.
    	
    	 	
    	
    	
    	
    	
    	
    	
    	
        // Test the functions
    			double F = 32.0;
    			double C = 0.0;
    			double F2C = F2C(F);
    			double C2F = C2F(C);
    			
    	// Print the results		
    			System.out.println(F + " degrees Fahrenheit is " + F2C + " degrees Celsius.");
    			System.out.println(C + " degrees Celsius is " + C2F + " degrees Fahrenheit.");
    			System.out.println("The fourth root of " + F + " is " + fourthRoot(F) + ".");
    			System.out.println("The fourth root of " + 81 + " is " + fourthRoot(81) + ".");
    			System.out.println("The cutoff of " + 3.14159 + " is " + cutoff(3.14159) + ".");
    			    			
    			
    } // End of main method
    
    // Implement your functions below
    // Task 1: Fahrenheit to Celsius
    public static double F2C(double F) {
		return (5.0 / 9.0) * (F - 32);
	}
	
	// Task 2: Celsius to Fahrenheit
	public static double C2F(double C) {
		return (9.0 / 5.0) * C + 32;
	}
	/*
	 * //Task 3: Fourth root public static double fourthRoot(double x) { return
	 * Math.pow(x, 0.25); // 0.25 is the same as 1/4 }
	 */
	// Task 3: Fourth root
	public static double fourthRoot(double x)
	{
		double result = Math.sqrt(Math.sqrt(x));
		return result;
	}
	
//	// Task 4: Cutoff to two decimal places
//	static double cutoff	 (double x)
//	{
//		double result = Math.round(x * 100) / 100.0;
//		return result;
//	}
	
	static double cutoff(double x) {
		int rounded = (int) x * 100;
		double result = (double) rounded / 100.0;
		return result;
		
	}
	
	
}