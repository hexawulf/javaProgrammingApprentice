package l07;

public class L07Strings7
{
public static void main(String[] args)
{

System.out.println("Strings in Functions");	
String phrase1 = "Abracadabra@";
String guide   = "012345678901234567890";
 

System.out.println(keepEvens(phrase1));
System.out.println(skipBack(guide));



}//end of main
public static String keepEvens(String s) // KeepEvens function, function head
{
	String temp = "";
	for (int i = 0; i < s.length(); i+=2)
	{
			
			temp += s.charAt(i);
		}
		return temp;
}


public static String skipBack(String s) // SkipBack function, function head
{
	String temp = "";
	for (int j = s.length() -1; j>=0; j-=2)
	{
			temp += s.charAt(j);
		}
		return temp;
}
} //end of class

