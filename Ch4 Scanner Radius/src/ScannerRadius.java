
import java.util.Scanner;
import java.lang.Math;

public class ScannerRadius {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a radius");
		int radius = in.nextInt();
		
		double area = Math.PI * (radius * radius);
		double circumference = Math.PI * (2 * radius);
		double volume = ((4 * Math.PI * (radius * radius * radius)) / 3);
		double surfaceArea = 4 * Math.PI * (radius * radius);
		
		System.out.printf("The area is %f", area);
		System.out.printf(" The circumference is %f", circumference);
		System.out.println();
		System.out.printf("The volume is %f", volume);
		System.out.printf(" The surace area is %f", surfaceArea);
		System.out.println();
	}
}
