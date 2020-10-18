import java.util.Scanner;

public class PrimePrinter {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a number");
		
		int num = in.nextInt();
		
		PrimeGenerator pg = new PrimeGenerator(num);
		
		pg.printPrime();

	}

}
