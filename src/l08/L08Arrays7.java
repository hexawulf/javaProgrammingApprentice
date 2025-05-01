package l08;
//Arrays in functions

public class L08Arrays7
{

	public static void main(String[] args)
	{
			
		
				int [] someNums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 121};
				printArray(someNums);
				System.out.println("\nDone!");
				System.out.println("\nAverage: " + getAverage(someNums)); 
				System.out.println("\nDouble Array: ");
				printArray(DoubleArray(someNums));
					
					
	} //end of main
	
	
	
	public static void printArray(int[] nums)
	{
		for (int val : nums)
		{
			System.out.print(val + " ");
		}
	} //end of printArray
	
	public static double getAverage(int[] nums) {
	    double sum = 0;
	    for(int val : nums) {
	        sum += val;
	    }
	    return nums.length > 0 ? sum / nums.length : 0;
	}
	
	public static int [] DoubleArray(int [] nums)
	{
		int [] newArray = new int [nums.length];
		
		for (int i = 0; i < nums.length; i++)
		{
			newArray[i] = nums[i] * 2;
		}
		
		return newArray;
	} //end of DoubleArray
	
} //end of class





