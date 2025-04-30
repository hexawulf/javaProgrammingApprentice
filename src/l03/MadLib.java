package l03;
import java.util.Scanner;
public class MadLib
{
	public static void main(String[] args)
	{
		String dogBreed, color1, dogName, dwarfName; //dwarfAge;
		int num1;
		Scanner scanData = new Scanner(System.in);
		
		System.out.print("Welcome to  the MadLib generator! \n\n ");
		System.out.print("Enter a dog breed: ");
		dogBreed = scanData.nextLine();
		System.out.print("Enter a color: ");
		color1 = scanData.nextLine();
		System.out.print("Enter a dog name: ");
		dogName = scanData.nextLine();
		System.out.print("Enter a dwarf name: ");
		dwarfName = scanData.nextLine();
		System.out.print("Enter a number: ");
		//dwarfAge = scanData.nextLine();
		num1 = Integer.parseInt(scanData.nextLine());
		System.out.println("Once upon a time there was a " + color1 + " " + dogBreed + " named " + dogName + " who was owned by a Dwarf named " + dwarfName +" who was " + num1 + " years old, " +"but looked like he was " + (num1 * 10) + " years old.");
}
}