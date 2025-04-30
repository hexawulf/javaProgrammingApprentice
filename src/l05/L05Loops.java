package l05;

public class L05Loops
{

	public static void main(String[] args)
	{
		for (int i = 0; i < 10; i++) // for loop, i = 0 to 9 int i = initialization, i < 10 condition, i++ increment, i = loop control variable, only exists in the for loop
		{
			System.out.println("i = " + i); 
		}
		for (int j = 10; j >= 0; j--) // decrementing for loop, j = 10 to 0
		{
			System.out.println("j = " + j); 
		}
		for (int k=10;k <200; k+=2) // incrementing by 2 for loop, k = 10 to 200
		{
			System.out.println("k = " + k); 
		}
		System.out.println("for loop finished");
	}

}
