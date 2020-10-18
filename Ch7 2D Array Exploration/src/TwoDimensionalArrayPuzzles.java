
public class TwoDimensionalArrayPuzzles {
	
	public static void main (String[] args) {
		
		final int ROWS = 5;
		final int COLS = 5;
		
		int[][] grid = new int [ROWS][COLS];
		for (int i = 0; i < ROWS; i++)
		{
			for (int j = 0; j < COLS; j++)
			{
				grid[i][j] = j + 1 + i * 5;
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
