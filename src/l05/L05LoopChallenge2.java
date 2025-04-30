package l05;
import java.util.Scanner;

public class L05LoopChallenge2
{


	    public static void main(String[] args) {
	        Scanner scanNum = new Scanner(System.in);
	        int startNum, stopNum, skipNum;
	        System.out.print("Welcome to the loop challenge!\n");
	        System.out.print("Enter the starting number: ");
	        startNum = scanNum.nextInt();
	        System.out.print("Enter the stopping number: ");
	        stopNum = scanNum.nextInt();
	        System.out.print("Enter the number to skip: ");
	        skipNum = scanNum.nextInt();
	        System.out.println("You entered: " + startNum + ", " + stopNum + ", " + skipNum);
	        System.out.println("Using a for loop:");
	        for (int i = startNum; i <= stopNum; i+=skipNum) {
	        	{
	        		  System.out.println(i);
	                
	            }
	          
	        System.out.println("Task 2: Using a while loop");
	        int j = startNum;
	        while (j <= stopNum) {
            if (j % 5 != 0 && j % 7 != 0) {
                System.out.println(j);
            }
            j++;
	        }
	        System.out.println("Task 3: Using a do-while loop (skipping numbers divisible by 5 or 7)");
	        int k = startNum; // Use a different variable name here
	        do {
            if (k % 5 != 0 && k % 7 != 0) {
                System.out.println(k);
            }
            k++;
	        } while (k <= stopNum);
	        scanNum.close();}}}
	        