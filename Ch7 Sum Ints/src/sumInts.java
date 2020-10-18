import java.util.Arrays;

public class sumInts {
	
	public static int sumInts(int[] nums)
	{
		int x = 0;
		
		for(int i = 0; i < nums.length; i++)
		{
			x = x + nums[i];
		}
		return x;
	}

	public static void main(String[] args)
	{
		int[] nums = { 1, 2, 5, 4, 3 };
		System.out.println(sumInts(nums));
	}

}
