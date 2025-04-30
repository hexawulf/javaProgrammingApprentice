package l03;
import java.util.Scanner;
//import javax.swing.JOptionPane;


public class L03Input
{

	public static void main(String[] args)
	{
		String info1, info2;
		int num1;
		double num2;
		String firstName, lastName;
		Scanner scanData = new Scanner(System.in);
		
//		info1 = JOptionPane.showInputDialog("Enter your name: ");
//		System.out.println("Hello " + info1 + "!");
//		info1 = JOptionPane.showInputDialog(null, "Enter a name: ", "Title Info", JOptionPane.INFORMATION_MESSAGE);
//		System.out.println("Hello " + info1 + "!");
//		info2 = JOptionPane.showInputDialog("Enter a number: ");
//		//num1 = Integer.parseInt(info2);
//		num2 = Double.parseDouble(info2);
//		System.out.println("You entered: " + info2);
//		System.out.println("The number you entered is: " + num2);

		
		System.out.print("Enter a name: ");
		info1 = scanData.nextLine();
		System.out.println("Hello " + info1 + "!");
		System.out.print("Enter a number: ");
		info1 = scanData.nextLine();
		num1 = Integer.parseInt(info1);
		System.out.println(num1 + 5);
		System.out.print("Enter a number with decimals: ");
		info2 = scanData.nextLine();
		num2 = Double.parseDouble(info2);
		System.out.println(num2);
		System.out.println("Enter a first name: ");
		firstName = scanData.nextLine();
		System.out.println("Enter a last name: ");
		lastName = scanData.nextLine();
		System.out.println("Welcome, Dr. " + lastName + ".");
		System.out.println("Or do you prefer " + firstName + "?");
		
		
	}

}
