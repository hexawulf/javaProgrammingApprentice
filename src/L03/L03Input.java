package L03;
import javax.swing.JOptionPane;


public class L03Input
{

	public static void main(String[] args)
	{
		String info1, info2;
		int num1;
		double num2;
		info1 = JOptionPane.showInputDialog("Enter your name: ");
		System.out.println("Hello " + info1 + "!");
		info1 = JOptionPane.showInputDialog(null, "Enter a name: ", "Title Info", JOptionPane.INFORMATION_MESSAGE);
		System.out.println("Hello " + info1 + "!");
		info2 = JOptionPane.showInputDialog("Enter a number: ");
		//num1 = Integer.parseInt(info2);
		num2 = Double.parseDouble(info2);
		System.out.println("You entered: " + info2);
		System.out.println("The number you entered is: " + num2);
	}

}
