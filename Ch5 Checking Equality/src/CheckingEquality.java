
import java.util.Scanner;

public class CheckingEquality {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int first = in.nextInt();
		int second = in.nextInt();
		int third = in.nextInt();
		
		if (first == second && second == third && third == first)
		{
			System.out.println("all the same");
		}
			
		else if (first != second && second != third && third != first)
		{
			System.out.println("all different");
		}
		else
		{
			System.out.println("neither");
		}
		
		
	}

}

