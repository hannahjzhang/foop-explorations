import java.util.Arrays;

public class populateWithSquares {
	
	public static void populateWithSquares(int[]nums)
	{
		for(int i = 0; i < nums.length; i++)
		{
			nums[i] = i*i;
		}
	}
	
	public static void printArray(int[] nums)
	{
		for(int i = 0; i < nums.length; i++)
		{
			System.out.print(nums[i] + " ");
		}
	}
	
	public static void main(String[] args)
	{
		int[] squares = new int[20];
		populateWithSquares(squares);
		printArray(squares);
	
	}
	
}
