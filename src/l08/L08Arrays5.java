package l08;
//Matrix: Jagged arrays .the size of each row can be different, only big enough to hold the number of columns we need

public class L08Arrays5
{

	public static void main(String[] args)
	{
			
		
				int [][] jagged = { 
									{91, 82, 93, 84, 12, 23, 45}, 
						   			{74, 75, 86, 84, 76}, 
			             			{70, 89, 92, 99, 84, 84 , 65} 
			             		  };
				for ( int row = 0; row < jagged.length; row++)
				{
					for(int col = 0; col < jagged[row].length; col++)
						System.out.print(jagged[row][col] + " ");
					
					System.out.println();
					
				}
	}

}



