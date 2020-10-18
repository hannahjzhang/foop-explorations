
public class fibo {
	
	public static void fibo (int[] nums)
	{
		for(int i = 2; i < nums.length; i++)
		{
			nums[0] = 0;
			nums[1] = 1;
			nums[i] = nums[i-1] + nums[i-2];
		}
	}
	
	public static void printArray(int[] nums)
	{
		for(int i = 0; i < nums.length; i++)
		{
			System.out.print(nums[i] + " ");
		}
	}
	
	public static void main (String[] args)
	{
		int[] x = new int[10];
		fibo(x);
		printArray(x);
	}

}
