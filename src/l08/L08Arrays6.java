package l08;
//String methods with array

public class L08Arrays6
{

	public static void main(String[] args)
	{
		
				String name1 = "Jackson";
				String name2 = new String("ville");
				String name3 = name1 + name2;
				System.out.println(name3);
				
				
				//Convert a char array to String
				char [] charName = {'S', 'm', 'i', 't', 'h'};
				String name4 = new String(charName);
				System.out.println(name4);
				
				 //Convert String to char array
				char [] charList = name3.toCharArray();
				for(char letter : charList)
				{
					System.out.print(letter + " ");
				}
				
		
	}
} //end of class





