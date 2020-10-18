import java.util.ArrayList;

public class printArrayList {
	
	public static void main(String args[]) {
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(9);
		nums.add(3);
		nums.add(5);
		
		printArrayList(nums);
		
		ArrayList<Double> dub = new ArrayList<Double>();
		dub.add(8.0);
		dub.add(4.0);
		dub.add(7.0);
		
		System.out.println(sum(dub));
		
		ArrayList<String> str = new ArrayList<String>();
		str.add("B0b");
		str.add("hannah");
		str.add("980asd");
		str.add("45");
		str.add("zhang");
		
		removeStringsWithDigits(str);
		
	}
	
	public static void printArrayList(ArrayList<Integer> nums) 
	{
		for (int i = 0; i < nums.size(); i++)
		{
			System.out.print(nums.get(i) + " ");
		}
		System.out.println();
	}
	
	public static int sum(ArrayList<Double> nums)
	{
		int total = 0;
		for (int i = 0; i < nums.size(); i++)
		{
			total += nums.get(i);
		}
		return total;
	}
	
	public static boolean isNum(String str)
	{
		for (int i = 0; i < str.length(); i++)
		{
			if(Character.isDigit(str.charAt(i)))
				return true;
		}
		return false;
	}
	
	public static void removeStringsWithDigits(ArrayList<String> nums)
	{
		for (int i = 0; i < nums.size(); i++)
		{
			if(isNum(nums.get(i)))
			{
				nums.remove(i);
				i = i - 1;	// after deletion index shifts
			}
		}
		for (int j = 0; j < nums.size(); j++)
		{
			System.out.print(nums.get(j));
		}
	}
}
