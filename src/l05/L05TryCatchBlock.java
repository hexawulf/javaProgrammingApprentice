package l05;
import java.util.Scanner;
public class L05TryCatchBlock
{

	public static void main(String[] args)
	{
	int a,b,c;	
	Scanner newScanner = new Scanner(System.in);
	System.out.println("Enter two numbers: ");
	a = newScanner.nextInt();
	b = newScanner.nextInt();
	try
	{
		c = a / b;
		System.out.println("The result is: " + c);
	}
	catch (ArithmeticException e)
	{
		System.out.println("You cannot divide by zero.");
	}
	finally
	{
		System.out.println("This block always executes.");
		newScanner.close();
	}
	System.out.println("End of program.");
	//System.out.println("End of program.");
}}