package l05;

public class L05LoopRunVariations
{

	public static void main(String[] args)
	{
		//Loops that run once
		//Loops that run never
		//Loops that run n times
		//Loops that run forever
		//Loops that run n times with a break statement
		System.out.println("Loops that run once");
		System.out.println("Loops that run n times");
		System.out.println("Loops that run never");
		System.out.println("Loops that run forever\n\n");
		
		
		for (int i = 0; i < 10; i+=10) // for loop that runs once, incrementing by 10 will only run once
		{
			System.out.println("This loop runs once");
		}
		for (int j = 0; j > 10; j++) // predicate is false, for loop that runs never, incrementing by 1 will never run
		{
			System.out.println("This loop runs never");
		}
		for (int i = 0; i < 10; i++) // for loop that runs n times
		{
			System.out.println("This loop runs " + (i+1) + " times");
		}
		for (int i = 0; i < 10; i--) // for loop that runs forever, it will always be less than 10
			{System.out.println("This loop runs forever");
			
		}
				
	}

}
