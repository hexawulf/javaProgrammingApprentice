package l06;

public class L06Functions
{

	public static void main(String[] args)
	{
		//Methods or Functions in Java
		//Method: a block of code that performs a specific task
		//Function: a block of code that performs a specific task and returns a value
		//Method Signature: the name of the method, the return type, and the parameters
		//Method Overloading: the ability to create multiple methods with the same name but different parameters
		//Method Overriding: the ability to create a method in a subclass that has the same name and parameters as a method in the superclass
		//Method Declaration: the process of creating a method
		//Method Call: the process of calling a method to execute its code
		//Method Return: the process of returning a value from a method
		//Method Parameters: the variables that are passed to a method when it is called
		
		int iNum =7;
		int iNumDouble;
		iNumDouble = doubler(iNum); // function call
		//iNumDouble = iNum * 2;
		System.out.println("The double of " + iNum + " is " + iNumDouble);
	}
		static int doubler(int num) // static method, function head
		{
			int temp;
			temp = num * 2; // function body
			return temp; // return statement
			
		}
		
		
		

	}


