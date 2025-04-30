package l07;

public class L07Strings
{
public static void main(String[] args)
{
String word = "Hello, world!"; // Strings in Java are objects of the String class, java.lang.String
String word2 = "";
String word3 = " ";
System.out.println("My first string is " + word);
System.out.println("My first string is " + word.length() + " characters in length.");
System.out.println("And now the uppercase version: " + word.toUpperCase() + "."); 
System.out.println("My first string is " + word); // word is unchanged, because strings are immutable, but you can assign a new value to it
word = word.toUpperCase();
System.out.println("My overwritten string is " + word); // word is now uppercase
System.out.println("Word is empty: " + word.isEmpty()); // isEmpty() checks for empty string
System.out.println("Word2 is empty: " + word2.isEmpty()); // isEmpty() checks for empty string
System.out.println("Word3 is blank: " + word3.isBlank()); // isBlank() checks for empty or whitespace
}}
