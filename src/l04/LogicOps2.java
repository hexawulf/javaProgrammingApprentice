package l04;

public class LogicOps2
{

	public static void main(String[] args)
	{
	double outsideTemp = -2;
	double objectTemp = 1;
	double freezingPoint = -1;
	if (outsideTemp < freezingPoint && objectTemp < freezingPoint)
	{
		System.out.println("Both are frozen");
	}
	else if (outsideTemp < freezingPoint || objectTemp < freezingPoint)
	{
		System.out.println("One is frozen");
	}
	else
	{
		System.out.println("Neither is frozen");

	}
	int age = 10;
	boolean isWithParent = false;
	double height = 1.6;
	if (( age >= 12 || isWithParent ) && height >= 1.5)
	{
		System.out.println("You can go on the ride");
	}
	else
	{
		System.out.println("You cannot go on the ride");
	}
}}
