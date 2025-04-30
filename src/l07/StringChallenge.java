package l07;

// Task 1: 
// Write a function that will take in a string
// and will return a string with the spaces removed
// The header is: static String RemoveSpaces(String input)

// Task 2:
// Write a function the will take in a string
// and will return the string by only keeping the letters:
// no numbers, spaces, or special characters
// The header is: static String KeepLetters(String input)


// Task 3:
// Write a function the will take in a string
// and will return the string reversed
// The header is: static String Reverse(String input)


public class StringChallenge
{

	public static void main(String[] args)
	{
		String testString = "To be, or not to be: #Hamlet Act 3, Scene 1";
		String complexTest = "Java Programming 123!";
		StringIndexGuide.printIndexGuide(complexTest);
		System.out.println("Removed spaces: " + RemoveSpaces(complexTest));
		System.out.println("Only letters: " + KeepLetters(complexTest));
		System.out.println("Reversed: " + Reverse(complexTest));


	} //end of psvm

	static String RemoveSpaces(String input)
	{
		String temp = "";
		for(int i = 0; i < input.length(); i++)
		{
			if(input.charAt(i) != ' ')
			{
				temp += input.charAt(i);
			}
		}
		return temp;
	}
	
	static String KeepLetters(String input)
	{
		String temp = "";
		for(int i = 0; i < input.length(); i++)
		{
			if(input.toUpperCase().charAt(i) >= 'A' && 
				input.toUpperCase().charAt(i) <= 'Z')
			{
				temp += input.charAt(i);
			}
		}
		return temp;
	}
	
	static String Reverse(String input)
	{
		String temp = "";
		for(int i = input.length() - 1; i >= 0; i--)
		{
			//temp += input.charAt(i);
			temp += input.substring(i, i+ 1);
		}
		return temp;
	}
	
	
} //end of main
