
import java.util.Scanner;

public class Binary {
	
	public static void main(String[] args)
	{
		
		Scanner in = new Scanner (System.in);
		System.out.println("Please input a number");
		
		int num = in.nextInt();
		
		Binary b = new Binary();
		System.out.println(b.toBinaryString(num));
		
	}
	
	public String toBinaryString(int num)
	{
		String y = "";
		
		while (num > 0)
		{
			if (num % 2 == 0)
				y = "0" + y;
			else
			{
				y = "1" + y;
			}
			
			num = num / 2;
	
		}
		return y;
	}

}
