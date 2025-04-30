package l06;

public class L06Functions5
{

	public static void main(String[] args)
	{
		 //The difference between a function and a subroutine is that a function returns a value, while a subroutine does not.
		// A subroutine does not return a value, but it can still perform actions or modify variables.
		// A function is a block of code that performs a specific task and returns a value.
		Greeting();
		Greeting("0xWulf");
		}
// End of psvm
static void Greeting()
	{
		// This is a subroutine that does not return a value.
		System.out.println("Hello, World!");
		return; // This return statement is optional in a subroutine.
	}
static void Greeting(String name)
	{
		// This is a function that returns a value.
		System.out.println("Hello, " + name + "!");
		return; // This return statement is optional in a function.
	}

	
	
	}