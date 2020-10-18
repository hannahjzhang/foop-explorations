import java.util.Scanner;

public class CompassDirection {
	
	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);
		double x = in.nextDouble();
		
		if (x >= 337.5 && x <= 22.5)
		{
			System.out.println("N");
		}
		else if (x > 22.5 && x < 67.5)
		{
			System.out.println("NE");
		}
		else if (x >= 67.5 && x <= 112.5)
		{
			System.out.println("E");
		}
		else if (x > 112.5 && x < 157.5)
		{
			System.out.println("SE");
		}
		else if (x >= 157.5 && x <= 202.5)
		{
			System.out.println("S");
		}
		else if (x > 202.5 && x < 247.5)
		{
			System.out.println("SW");
		}
		else if (x >= 247.5 && x <= 292.5)
		{
			System.out.println("W");
		}
		else if (x > 292.5 && x < 337.5)
		{
			System.out.println("NW");
		}
		else
		{
			System.out.println("?");
		}
		
	}

}
	
