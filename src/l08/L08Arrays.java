package l08;

public class L08Arrays
{

	public static void main(String[] args)
	{
		//track scores
		int[] scores1 = {90, 85, 78, 92, 88, 95};
		//traverse the array
		for (int i = 0; i < scores1.length; i++) // .length is a property of the array, not a method
		{
			System.out.println("Score " + (i + 1) + ": " + scores1[i]); // scores at index i (subscript i)
		}
		
		
		System.out.println("Scores 2 Array");
		int [] scores2 = new int[5]; // declare an array of size 5, empty array
		scores2[3] = 44; // assign value to index 3
		for (int i = 0; i < scores2.length; i++)
		{
			System.out.println("Index: " + i + " Value: " + scores2[i]); // scores at index i (subscript i)
		}
		
		int scores3[];
		scores3 = new int[] {77, 88, 99, 75, 23}; // declare and assign values to the array
		for (int i = 0; i < scores3.length; i++)
		{
			System.out.println("Index: " + i + " Value: " + scores3[i]); // scores at index i (subscript i)
		}
		
		int counter = 0;
		int sum = 0;
		
		for (int i = 0; i < scores3.length; i++)
		{
			System.out.println("Index: " + i + " Value: " + scores3[i]); // scores at index i (subscript i)
			sum += scores3[i]; // sum of all scores
			counter++; // count the number of scores
		}
		System.out.println("Sum of all scores: " + sum); // sum of all scores
		System.out.println("This loop ran: " + counter + " times"); // count the number of scores
		double average = (double) sum / counter; // average of all scores
		System.out.println("Average of all scores: " + average); // average of all scores
		
		
		
		//another way of traversing the array with a for-each loop
		System.out.println("Scores 3 Array");
		counter = 0; // reset counter
		sum = 0; // reset sum
		for (int grade : scores3) // for each grade in the array
		{	
			System.out.println("Grade: " + grade); // print the score
			sum += grade; // sum of all scores
			counter++; // count the number of scores
			
		}
	
		System.out.println("Sum of all grades: " + sum); // sum of all scores
		System.out.println("This for each loop ran: " + counter + " times"); // count the number of scores
		
	}

}



/*
 * System.out.println("Scores 2 Array"); int [] scores2 = new int[5]; // declare
 * an array of size 5, empty array for (int i = 0; i < scores2.length; i++) {
 * scores2[i] = (int) (Math.random() * 100); // assign random values to the
 * array System.out.println("Score " + (i + 1) + ": " + scores2[i]); // scores
 * at index i (subscript i) }
 */