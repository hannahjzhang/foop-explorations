
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a number");
		
		int first = in.nextInt();
		
		final String months = "January  ,February ,March    ,April    ,May      ,June     ,July     ,August   ,September,October  ,November ,December ";
		int startNumber = (first - 1) * 10;
		System.out.println(months.substring(startNumber, startNumber + 9));

	}

}
