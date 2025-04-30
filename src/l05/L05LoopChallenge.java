package l05;
import java.util.Scanner;

public class L05LoopChallenge
{


	    public static void main(String[] args) {
	        // Assuming the "same numbers" from Task 1 and 2 were a range from 1 to 10

	        System.out.println("Task 1: Using a for loop");
	        task1ForLoop(1, 10);

	        System.out.println("\nTask 2: Using a while loop");
	        task2WhileLoop(1, 10);

	        System.out.println("\nTask 3: Using a do-while loop (skipping numbers divisible by 5 or 7)");
	        task3DoWhileLoop(1, 10);
	    }

	    public static void task1ForLoop(int start, int stop) {
	        for (int i = start; i <= stop; i++) {
	            System.out.println(i);
	        }
	    }

	    public static void task2WhileLoop(int start, int stop) {
	        int i = start;
	        while (i <= stop) {
	            System.out.println(i);
	            i++;
	        }
	    }

	    public static void task3DoWhileLoop(int start, int stop) {
	        int i = start;
	        do {
	            if (i % 5 != 0 && i % 7 != 0) {
	                System.out.println(i);
	            }
	            i++;
	        } while (i <= stop);
	    }
	}