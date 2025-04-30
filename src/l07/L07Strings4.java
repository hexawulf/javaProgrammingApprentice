package l07;

public class L07Strings4
{
public static void main(String[] args)
{
String phrase1 = "Abracadabra";
String phrase2 = "Presto!";
String guide   = "012345678901234567890";
System.out.println(phrase1.length()); // 11
System.out.println(phrase1.compareToIgnoreCase(phrase2)); // lexicographically compares the two strings, if lhs < rhs, returns negative value, meaning lhs comes before rhs in dictionary order

if (phrase1.compareToIgnoreCase(phrase2) < 0)
{
	System.out.println(phrase1 + " comes before " + phrase2);
}
else if (phrase1.compareToIgnoreCase(phrase2) > 0)
{
	System.out.println(phrase1 + " comes after " + phrase2);
}
else
{
	System.out.println(phrase1 + " is equal to " + phrase2);
}
}//end of main

} //end of class

