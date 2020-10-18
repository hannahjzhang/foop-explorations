
import java.util.Scanner;
import java.lang.Math;

public class Main {

	public static void main(String[] args) {
		
		// creates a scanner object that allows the computer to read the input
		Scanner in = new Scanner(System.in);
		
		// prompts the user to enter two integers
		System.out.print("Enter two integers");
		
		// reads the integers
		int first = in.nextInt();
		int second = in.nextInt();
		
		// executes the method
		System.out.printf("Sum is: %d", (first + second));
		// enters it to the next line
		System.out.println();
		
		System.out.printf("Difference is: %d", (first - second));
		System.out.println();
		
		System.out.printf("Product is: %d", (first * second));
		System.out.println();
		
		System.out.printf("Average is %.1f", ((first + second) / 2.0));
		System.out.println();
		
		System.out.printf("Distance is %d", Math.abs(first - second));
		System.out.println();
		
		System.out.printf("Maximum is %d", Math.max(first, second));
		System.out.println();
		
		System.out.printf("Minimum is %d", Math.min(first, second));
		System.out.println();
		
	}
}