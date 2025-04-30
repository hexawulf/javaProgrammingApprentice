package l07;

public class L07Strings5
{
public static void main(String[] args)
{
String phrase1 = "Abracadabra";
String guide   = "012345678901234567890";

System.out.println(phrase1);
System.out.println(guide);
System.out.println(phrase1.length()); // 11
System.out.println(phrase1.charAt(4));
System.out.println(phrase1.indexOf('c')); // 0
System.out.println(phrase1.lastIndexOf('a')); // 0

char charLetter  = phrase1.charAt(8);
System.out.println("charLetter: " +charLetter + ".");
if (charLetter >= 'a' && charLetter <= 'z') {
	System.out.println("charLetter is a lowercase letter.");
}
else if (charLetter >= 'A' && charLetter <= 'Z') {
	System.out.println("charLetter is an uppercase letter.");
}
else {
	System.out.println("charLetter is not a letter.");
}// 0


}//end of main

} //end of class

