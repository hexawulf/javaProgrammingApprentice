package l05;

import java.util.Scanner;

public class L05WhileLoopVariations {
    public static void main(String[] args) {
        // Loops that run once
        System.out.println("Loops that run once");
        int i = 0;
        while (i < 10) {
            System.out.println("This loop runs once");
            i += 10;
            break;
        }

        // Loops that run never
        System.out.println("\nLoops that run never");
        int j = 0;
        while (j > 10) {
            System.out.println("This loop runs never");
            j++;
        }

        // Loops that run n times
        System.out.println("\nLoops that run n times");
        int k = 0;
        int n = 10;
        while (k < n) {
            System.out.println("This loop runs " + (k + 1) + " times");
            k++;
        }

     // Loops that run forever with a break condition
		/*
		 * System.out.
		 * println("\nLoops that run forever - press any key and then Enter to break");
		 * Scanner scanner = new Scanner(System.in); int l = 0; while (l < 10) {
		 * System.out.println("This loop runs forever (until you press a key and Enter)"
		 * ); l--;
		 * 
		 * try { if (System.in.available() > 0) { // Check if there are bytes available
		 * to read scanner.nextLine(); // Read the entire line (including Enter) break;
		 * } Thread.sleep(100); // Small delay } catch (Exception e) {
		 * e.printStackTrace(); } } scanner.close();
		 * System.out.println("Infinite loop broken!");
		 */
        
        
        int k2 = 0;
        do {
        	System.out.println("This do while loop runs once");
        } while (k2  < 0); // do while loop that runs once, it will run once and then exit
        
        int k3 = 10;
        do {
        	System.out.println("This do while loop runs forever");
        } while (k3  > 0); // do while loop that runs once, it will run once and then exit
        
        
        
        
}}