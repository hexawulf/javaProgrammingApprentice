package l07;

public class L07Strings3
{
public static void main(String[] args)
{

	// Substring method, extracting a substring from a string
	String phrase = "It was a dark and stormy night";
	String guide  = "1234567890123456789";
	String city   = "Salt Lake City";
	String newCity = " ";
	System.out.println(phrase.length()); // 30
	System.out.println(phrase.substring(3)); // "was a dark and stormy night"
	System.out.println(phrase.substring(3, 6)); // "was "
	System.out.println("At index 30: " + phrase.substring(30)); // "empty, exceeds length"
	
	// String concatenation
	for (int i = 0; i < phrase.length(); i++)
	{
		System.out.println(phrase.substring(i, i + 1));
	}
	
	
	// String comparison
	for (int i = 0; i < phrase.length(); i++)
	{
		if (!phrase.substring(i, i + 1).equals("a")) // "a" is not equal to "a"
		{
			System.out.println(phrase.substring(i, i + 1));
		}
				
	}
	newCity = city.substring(0, 4);
	System.out.println(newCity); // "Salt"
	newCity += " " + city.substring(10, 14);
	System.out.println(newCity); // "Salt Lake"
	
}//end of main
} //end of class

