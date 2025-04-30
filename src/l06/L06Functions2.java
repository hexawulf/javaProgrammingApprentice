package l06;

public class L06Functions2
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
		int num1, num2, num3;
		num1 = 12124;
		num2 = 134566;
		num3 = 4356;
		
		int maxNum = findmax(num1, num2); // function call
		System.out.println("The maximum of " + num1 + " and " + num2 + " is " + maxNum);
		int maxNum3 = findmax3(num1, num2, num3); // function call
		System.out.println("The maximum of " + num1 + ", " + num2 + " and " + num3 + " is " + maxNum3);
		int maxNum4 = findmax4(num1, num2, num3); // function call
		System.out.println("The maximum of " + num1 + ", " + num2 + " and " + num3 + " is " + maxNum4);
		int maxNum5 = findmax4(maxNum3, maxNum4, num1); // function call	
		System.out.println("maxNum5 is: " + maxNum5);
		int maxNum6 = findmax4(findmax3(num1,num2,num3), maxNum4, num1); // function call
		System.out.println("maxNum6 is: " + maxNum6);
	}
		static int doubler(int num) // static method, function head
		{
			int temp;
			temp = num * 2; // function body
			return temp; // return statement
			
		}
		
		static int findmax(int num1, int num2) // static method, function head
		{
			int max;
			if (num1 >= num2)
			{
				max = num1;
			}
			else
			{
				max = num2;
			}
			return max; // return statement
		}	
		
		static int findmax3(int num1, int num2, int num3) // static method, function head
		{
			int max;
			if (num1 >= num2 && num1 >= num3)
			{
				max = num1;
			}
			else if (num2 >= num1 && num2 >= num3)
			{
				max = num2;
			}
			else
			{
				max = num3;
			}
			return max; // return statement
		}
		
		static int findmax4(int num1, int num2, int num3) // static method, function head
		{
			int max = num1; //assume num1 is the largest
			if (num2 > max) //if num2 is larger than max
				max = num2; //set max to num2
			if (num3 > max) //if num3 is larger than max
				max = num3; //set max to num3
			return max; // return statement
					
			
		}
		

	}


