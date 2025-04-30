package l05;

public class L05WhileLoop
{

	public static void main(String[] args)
	{
		int i = 0; // initialization
		int count = 0; // initialization of count
		while (i < 10) // condition
		{
			System.out.println("i = " + i); // body of the loop
			i++; // increment
			count++; // incrementing count
		}
		System.out.println("This loop has run " + count + " times"); // print the number of times the loop has run
		int j = 50; // initialization
		int count2 = 0; // initialization of count2
		while (j >= 0) // condition
		{
			System.out.println("j = " + j); // body of the loop
			j --; // decrementing by 1
			count2++; // decrementing count2
		}
	System.out.println("This loop has run " + count2 + " times"); // print the number of times the loop has run}
	
	
	}
	
	// use a for loop when you know how many times you want to run the loop
	
}
