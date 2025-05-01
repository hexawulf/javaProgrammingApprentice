package l08;
//creating two-dimensional arrays: Matrix
// array of arrays

public class L08Arrays3
{

	public static void main(String[] args)
	{
		int[][] matrix = new int[3][4]; // 3 rows, 4 columns
		int[][] matrix2 = {
				{ 1, 2, 3, 4 },
				{ 5, 6, 7, 8 },
				{ 9, 10, 11, 12 }
		}; // 3 rows, 4 columns	
		// nested for loop
		for (int i = 0; i < matrix2.length; i++)
		{
			for (int j = 0; j < matrix2[i].length; j++)
			{
				System.out.print(matrix2[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}



