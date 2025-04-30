package l05;

import java.util.Scanner;

public class L05DoWhileLoop
{

	public static void main(String[] args)
	{
	System.out.println("Do While Loop");
		int i = 0;
		int input = -99; // initialization
		Scanner sc = new Scanner(System.in); // scanner object to take input from user
		do
		{
			//System.out.println("Increments through i = " + i);
			System.out.print("Enter a number (0 to quit): ");
			input = sc.nextInt(); // taking input from user
			System.out.print("You entered:"  + input + "\n"); // print the input
			i++;
		} while (input !=0); // do while loop 
		System.out.println("You entered 0, exiting the loop"); // print the exit message
				
		int j = 10;
		do
		{
			System.out.println("j = " + j);
			j--;
		} while (j >= 0); // decrementing do while loop, j = 10 to 0
		System.out.println("do while loop finished");
		
		int k=10;
		do
		{
			System.out.println("k = " + k);
			k+=2;
		} while (k <200); // incrementing by 2 do while loop, k = 10 to 200
		System.out.println("do while loop finished");

	}

}
