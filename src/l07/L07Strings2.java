package l07;

public class L07Strings2
{
public static void main(String[] args)
{
String word1 = "Hello";
String word2 = "Hello";
String word3 = new String("Hello"); // new String() creates a new object in memory, even if the content is the same
String word4 = "Erling Wulf Weinreich"; // String with a space
if (word1 == word2) { // == checks if the two references point to the same object in memory
	System.out.println("Using ==, word1 and word2 are the same object in memory.");
} else {
	System.out.println("Using ==, word1 and word2 are different objects in memory.");
}

if (word1.equals(word2)) { // string1.equals(string2) checks if the two strings have the same value
	System.out.println("Using equals(), word1 and word2 have the same content.");
} else {
	System.out.println("Using equals(), word1 and word2 have the same content.");
}
if (word1 == word3) { // == checks if the two references point to the same object in memory
	System.out.println("Using ==, word1 and word3 are the same object in memory.");
} else {
	System.out.println("Using ==, word1 and word3 are different objects in memory.");
if (word1.equals(word3)) { // string1.equals(string2) checks if the two strings have the same value
	System.out.println("But using equals(), word1 and word3 have the same content.");
} else {
	System.out.println("But using equals(), word1 and word3 have different content.");
	
}}
System.out.println("Does the String word4 contain Erling:  " + word4.contains("Erling")); //	contains() checks if the string contains a substring
System.out.println("Does the String word4 contain Reich:  " + word4.toUpperCase().contains("reich".toUpperCase())); //	contains() checks if the string contains a substring

int x = 5;
System.out.println(++x); // pre-increment
int y = 5;
System.out.println(y++); // post-increment
}}
