package l04;

public class Operators
{

	public static void main(String[] args)
	{
		double a1,b1,c1,d1;
		a1 = b1 = c1 = d1 = 10;
		System.out.println("Logical Operators");
		System.out.println("&& (AND) operator");
		if (a1 <= b1 && c1 >= d1) // Logical AND, both conditions must be true
		{
			System.out.println("Both conditions are true");
		}
		else
		{
			System.out.println("At least one condition is false");
		}
		if (b1 < c1 || a1 *2 >= 10) // Logical OR, at least one condition must be true
		{
			System.out.println("At least one condition is true");
		}
		else
		{
			System.out.println("Both conditions are false");
		}
		if (!(a1 == b1)) // Logical NOT, negates the condition
		{
			System.out.println("The condition is false");
		}
		else
		{
			System.out.println("The condition is true");
		}
	}

}
