package L03;

import java.util.Scanner;

//import javax.swing.JOptionPane;

/**public class L03InputSolution
{

	public static void main(String[] args)
	{
		String info1, info2;
		int num1;
		double num2;
		
		info1 = JOptionPane.showInputDialog("Enter your name:");
		System.out.println(info1);
		info1 = JOptionPane.showInputDialog(null, "Enter a name", 
				"Title Info",
				JOptionPane.INFORMATION_MESSAGE);
		System.out.println(info1);
		info2 = JOptionPane.showInputDialog("Enter a number");
		// Uncomment the next line if you are using integers
		// num1 = Integer.parseInt(info2); 
		num2 = Double.parseDouble(info2);
		System.out.println(num2 + 7);	
		
		Scanner scanData = new Scanner(System.in);
		System.out.print("Enter a name: ");
		info1 = scanData.nextLine();
		System.out.println(info1);
		System.out.print("Enter a number: ");
		info1 = scanData.nextLine();
		num1 = Integer.parseInt(info1);
		System.out.println(num1 + 5);
		System.out.print("Enter a number with decimals: ");
		info2 = scanData.nextLine();
		num2 = Double.parseDouble(info2);		
		System.out.println(num2);
		String firstName, lastName;
		System.out.print("Enter a first name: ");
		firstName = scanData.nextLine();
		System.out.print("Enter a last name: ");
		lastName = scanData.nextLine();
		System.out.println("Welcome, Dr. " + lastName + ". Or do ");
		System.out.println("you prefer " + firstName + "?");
		
				
		
	}

}
*/