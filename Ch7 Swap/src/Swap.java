
public class Swap {
	
	public static void swap(int num[], int index1, int index2)
	{
		int stable = num[index1];
		num[index1] = num[index2];
		num[index2] = stable;
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
		int[] nums = { 1, 2, 5, 4, 3 };
		swap(nums, 2, 4);
		printArray(nums);
	}

}
