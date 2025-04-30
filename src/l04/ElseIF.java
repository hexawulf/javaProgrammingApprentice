package l04;

public class ElseIF
{

	public static void main(String[] args)
	{
		String gradeLetter;
		double grade = 88.0;
		if (grade >= 90.0)
		{
			gradeLetter = "A";
		}
		else if (grade >= 80.0)
		{
			gradeLetter = "B";
		}
		else if (grade >= 70.0)
		{
			gradeLetter = "C";
		}
		else if (grade >= 60.0)
		{
			gradeLetter = "D";
		}
		else
		{
			gradeLetter = "F";
		}
		System.out.println("Your grade is " + gradeLetter);
	}

}
