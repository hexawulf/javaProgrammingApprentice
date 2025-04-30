package l04;

public class L04MathOps
{
	public static void main(String[] args)
	{
	
	/*
	 * public static void main(String[] args) { int num1, num2, num3, num4, num5,
	 * num6, num7, num8, num9, num10, sum, prod, diff, quot; num1 = 10; num2 = 2;
	 * sum = num1 + num2; diff = num1 - num2; prod = num1 * num2; quot = num1 /
	 * num2; System.out.println("The sum of " + num1 + " and " + num2 + " is " +
	 * sum); System.out.println("The difference of " + num1 + " and " + num2 +
	 * " is " + diff); System.out.println("The product of " + num1 + " and " + num2
	 * + " is " + prod); System.out.println("The quotient of " + num1 + " and " +
	 * num2 + " is " + quot);
	 */


	/*
	 * public static void main(String[] args) { double num1, num2, num3, num4, num5,
	 * num6, num7, num8, num9, num10, sum, prod, diff, quot; num1 = 10; num2 = 3;
	 * sum = num1 + num2; diff = num1 - num2; prod = num1 * num2; quot = num1 /
	 * num2; System.out.println("The sum of " + num1 + " and " + num2 + " is " +
	 * sum); System.out.println("The difference of " + num1 + " and " + num2 +
	 * " is " + diff); System.out.println("The product of " + num1 + " and " + num2
	 * + " is " + prod); System.out.println("The quotient of " + num1 + " and " +
	 * num2 + " is " + quot);
	 * 
	 */


	/*
	 * int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10, sum, prod,
	 * diff, quot; num1 = 10; num2 = 3; sum = num1 + num2; diff = num1 - num2; prod
	 * = num1 * num2; quot = num1 / num2; //System.out.println("The sum of " + num1
	 * + " and " + num2 + " is " + sum); //System.out.println("The difference of " +
	 * num1 + " and " + num2 + " is " + diff);
	 * //System.out.println("The product of " + num1 + " and " + num2 + " is " +
	 * prod); //System.out.println("The quotient of " + num1 + " and " + num2 +
	 * " is " + quot); System.out.println("num1 is " + num1);
	 * System.out.println("num2 is " + num2); num1 = num1 + 4; // Accumulator
	 * pattern System.out.println("num1 is now " + num1); num1 = num1 + 1; //
	 * Counter pattern System.out.println("num1 is now " + num1); num2 = (5*6) /
	 * (3*2); // Order of operations System.out.println("num2 is " + num2);
	 */
	/*
	 * int x; x = 8; System.out.println("The increment operator:");
	 * System.out.println(); System.out.println("x is " + x); x = x + 1;
	 * System.out.println("x is now " + x); x+=1; // x = x + 1
	 * System.out.println("x is now " + x); x++; // x = x + 1 // Postfix increment
	 * System.out.println("x is now " + x); ++x ; // x = x + 1. Prefix increment
	 * System.out.println("x is now " + x);
	 * 
	 * 
	 * System.out.println(x++); // Postfix increment: first print, then increment
	 * System.out.println(x); System.out.println(++x); // Prefix increment: first
	 * increment, then print x--; // x = x - 1 // Postfix decrement
	 * System.out.println("x is now " + x); System.out.println();
	 * 
	 * 
	 * 
	 * System.out.println("And now, the decrement operator:");
	 * System.out.println("x is currently still " + x); --x; // x = x - 1 // Prefix
	 * decrement System.out.println("x is now " + x); System.out.println(x--); //
	 * Postfix decrement: first print, then decrement System.out.println(x);
	 * System.out.println(--x); // Prefix decrement: first decrement, then print
	 */

	/*
	 * int num1; //Assignment operators +=, -=, *=, /=, %= num1 = 18; num1 +=6; //
	 * num1 = num1 + 6 System.out.println("num1 is " + num1); num1 -= 4; // num1 =
	 * num1 - 4 System.out.println("num1 is " + num1); num1 *= 3; // num1 = num1 * 3
	 * System.out.println("num1 is " + num1); num1 /= 4; // num1 = num1 / 4
	 * System.out.println("num1 is " + num1);
	 */
		
	/*
	 * int num1, num2; System.out.println("The modulus operator:"); // % modulus
	 * operator returns the remainder of a division num1 = 17; num2 = 17 % 3;
	 * System.out.println("The remainder of 17 divided by 3 is " + num2); num1 = 19;
	 * num2 = num1 % 2; System.out.println("The remainder of " + num1
	 * +" divided by 2 is " + num2); num1 = 20; num2 = num1 % 2;
	 * System.out.println("The remainder of " + num1 +" divided by 2 is " + num2);
	 * // Use the modulus operator to determine if a number is even or odd (parity)
	 */	
	
	
		int value1, value2;
		value1 = 2;
		value2 = 9;

		// Check for equality
		if (value1 == value2) {
		    System.out.println("value1 is equal to value2");
		} else {
		    System.out.println("value1 is not equal to value2");
		}

		// Check for inequality
		if (value1 != value2) {
		    System.out.println("value1 is not equal to value2");
		} else {
		    System.out.println("value1 is equal to value2");
		}

		// Check if less than
		if (value1 < value2) {
		    System.out.println("value1 is less than value2");
		} else {
		    System.out.println("value1 is not less than value2");
		}

		// Check if greater than
		if (value1 > value2) {
		    System.out.println("value1 is greater than value2");
		} else {
		    System.out.println("value1 is not greater than value2");
		}

		// Check if less than or equal
		if (value1 <= value2) {
		    System.out.println("value1 is less than or equal to value2");
		} else {
		    System.out.println("value1 is not less than or equal to value2");
		}

		// Check if greater than or equal
		if (value1 >= value2) {
		    System.out.println("value1 is greater than or equal to value2");
		} else {
		    System.out.println("value1 is not greater than or equal to value2");
		}}}

