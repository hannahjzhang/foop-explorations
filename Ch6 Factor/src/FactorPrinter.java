import java.util.Scanner;

public class FactorPrinter {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a number");
		
		int num = in.nextInt();
		
		FactorGenerator fg = new FactorGenerator(num);
		
		while (fg.hasMoreFactors())
		{
			System.out.println(fg.nextFactor());
		}

	}

}
