
// works for side lengths 1-5, to make range bigger, add more to 
// space and star strings

import java.util.Scanner;

public class AsterickDisplay {
	
	public static void main(String[] args) {
		
		// takes in user input for side length
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a side length:");
		int sideLength = in.nextInt();
		
		int x = 1;
		String space = "                                  ";
		String star = "***********************************";
		
		// top part of the diamond
		for (x = 1; x < sideLength + 1; x++)
		{
			System.out.println(space.substring(0, sideLength - x + 1) + 
					(star.substring(0, (2 * x) - 1)) + space.substring(0, sideLength));
		}
		
		// bottom part of the diamond, works backwards
		for (x = sideLength + 1; x > 0; x--)
		{
			System.out.println(space.substring(0, sideLength - x + 1) +
					(star.substring(0, (2 * x) - 1)) + space.substring(0, sideLength));
		}
		
	}
	
}
		
//		int x = 0;
//		int y = 0;
//		
//		for (x = 0; x < sideLength; x++)
//		{
//			for (y = 0; y < sideLength - x - 1; y++)
//			{
//				System.out.print(" ");
//			}
//			for (y = 0; y < (2 * x) + 1; y++)
//			{
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
//		
//		int nspace = 1;
//		int asterick = 2 * sideLength - 3;
//		
//		for (asterick = 5; asterick == 1; asterick = asterick - 2)
//		{
//			for (y = 0; y < nspace; y++)
//			{
//				System.out.print(" ");
//			}
//			for (y = 0; y < asterick; y++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//			nspace = nspace + 1;
//			asterick = asterick + 1;
//		}
