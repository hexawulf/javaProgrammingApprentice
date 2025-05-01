package l08;
		//1) Given {3, 11, -10, 167, 2, 88, -40}
		// print the array in reverse
		//
		// 2) write a function that will find the maximum value in an array
		// Note: the array is assumed to have at least one value in it;
		//
		// 3) write a function that will take in a string, 
		// find the largest letter in a string, and return 
		// that letter as a character
		// Note: 'A' is larger than 'Z', 'Z' is larger than 'a', 
		// and 'a' is larger than 'z'
public class ArrayChallenge
{

	public static void main(String[] args)
	{
		int[] numbers = {3, 11, -10, 167, 2, 88, -40};
		for(int i = numbers.length - 1; i >= 0; i--)
		{
			System.out.print(numbers[i] + ", ");		
		}
		
		System.out.println(); 
		System.out.println(findMax(numbers));
		System.out.println(GetMaxLetter("Shakespeare"));
		

	} //end of main

		public static int findMax(int[] vals)
	{
		int max = vals[0];
		for(int i = 1; i < vals.length; i++)
		{
			if(vals[i] > max)
			{
				max = vals[i];
			}
		}
		return max;
	}
		
		
		public static char GetMaxLetter(String word)
		{
			char [] letters = word.toCharArray();
			char max = letters[0];
			for(char ltr : letters)
			{
				if(ltr > max)
					max = ltr;
			}
			return max;
		} //end of getMaxLetter
		
		
		
	
} //end of class
