package l07;

// write a function that will take in a string and remove
// the character at a particular position
// so, if you want to remove the character at position 8,
// you keep positions 0 through 7 inclusive, and 9 to the end
// if you want to remove a character at position x,
// you keep positions 0 through x - 1 inclusive, and x + 1 to the end
// if the position is not valid (negative or beyond the size of the
// string), just return the original string. 
// The header is: static String RemoveAtPosition(String s, int num)


// write a function that will check if a string contains
// any vowels (A, E, I, O, U)
// if it does, return true; otherwise return false
// The header is: static boolean HasVowels(String s


public class L07Strings6
{
public static void main(String[] args)
{
String phrase1 = "Abracadabra";
String guide   = "012345678901234567890";

System.out.println(RemoveAtPosition("Java", 2)); // remove the 'v', should return "Jaa"
System.out.println(RemoveAtPosition("Java", 20)); // out of bounds, should return "Java"
System.out.println(RemoveAtPosition("Java", -2)); // out of bounds, should return "Java"
System.out.println(RemoveAtPosition("Java", 0)); // remove the 'J', should return "ava"

System.out.println(HasVowels(phrase1));
System.out.println(HasVowels("rhythm"));


}//end of main

static String RemoveAtPosition(String s, int num)
{
	// error checking
	if(num < 0 || num >= s.length())
		return s;
	String temp = "";
	temp += s.substring(0, num);
	temp += s.substring(num + 1);
	return temp;
	
}


static boolean HasVowels(String s)
{
	String temp = s.toUpperCase();
	String vowelList = "AEIOU";
	for(int i = 0; i < s.length(); i++)
	{
		if(vowelList.contains(temp.substring(i, i+1)))
			return true;
	}
	return false;
	
}}//end of class





