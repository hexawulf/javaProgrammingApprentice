package l08;
//Matrix: Two dimensional array
// The plural is matrices
public class L08Arrays4
{

	public static void main(String[] args)
	{
						
				int [][] matrix1 = new int[3][4];
				int [][] matrix2 = { {91, 82, 93, 84}, 
						             {74, 75, 86, 84}, 
						             {70, 89, 92, 99} };
				for(int row = 0; row < matrix2.length; row++)
				{
					for(int col = 0; col < matrix2[0].length; col++)
						System.out.print(matrix2[row][col] + " ");
					
					System.out.println();
					
				}
	}

}



