package L02;


public class L02Variables
{
	enum traffic { red, yellow, green};
	
	public static void main(String[] args)
	{
		// Variables in math classes
		// What are variables in Java?

		int x;
		x = 7;
		int a = 50;
		double weight = 2.2;
		System.out.println("x");
		System.out.println(x);
		System.out.println(a);
		System.out.println(weight);
		boolean isOn = false;
		System.out.println(isOn);
		int y = x;
		System.out.println("y = " + y);
		y = (int) weight; // casting: temporarily declare weight as an integer
		System.out.println("y = " + y);
		String myName = "John";
		System.out.println(myName);
		String anything = "abc1\"23^&*"; // escape sequence
		System.out.println(anything);
		
		// naming variables
		// 1) only alphanumerics (upper and lower case letters and numbers) 
        //	  and one special character (the underscore)

		int luckyNumber = 7;
		double Value1 = 4.2;
		String first_name = "Michelle";
		
		// 2) They are Case Sensitive (upper case vs. lower case matters)
		double val1 = 4.2;
		double Val1 = 2.4;
		
		// 3) Cannot begin with a number (1stPlace)
		// int 1st = 1;
		
		// 4) Cannot have a space in them 
		String my_name = "Bob";
		
		// 5) Cannot be keywords 
		int myclass = 45;
		
		// 6) Cannot have variables of the same name
		int score;
		score = 12;
		
		// 7) Avoid single letter variables except in certain cases
		// int i,j,k; // for loops
		// int x,y,z; // for 3D coordinates
		int i = 4, j = 5, k = -3;
		// r/c s
		
		// Camel Case, Snake Case, Dromedary Case
		double massOfSample = 121.701;
		int number_of_votes = 106;
		double PI = 3.1415;
		double SQUARE_ROOT_OF_TWO = 1.41423;
		final double SR2;
		SR2 = 4.5;
		// SR2 = 1.1;
		// GetMaxValue

		int points = 99;
		double stats = 10.987654321;
		float average = 0.9f;
		System.out.println(average);
		long AGE_OF_UNIVERSE = 13_770_000_000L;
		System.out.println(AGE_OF_UNIVERSE);
		short ageOfTortoise = 200;
		byte age = 127; // -128 to 127
		char letterA = 65; // characters
		System.out.println(letterA);
		char letterB = 'c'; // characters
		System.out.println(letterB);

		traffic tLight;
		tLight = traffic.yellow;
		System.out.println(tLight);
		//tLight = 1;
		//tLight = "yellow";
		//tLight = traffic.blue;


	}

}