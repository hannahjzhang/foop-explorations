
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter corner coordinates");
		
		int f1 = in.nextInt();
		int f2 = in.nextInt();
		int s1 = in.nextInt();
		int s2 = in.nextInt();
		int t1 = in.nextInt();
		int t2 = in.nextInt();
		
		Triangle t = new Triangle(f1, f2, s1, s2, t1, t2);
		t.printLength();
		System.out.println();
		t.printAngle();
		System.out.println();
		t.printPerimeter();
		System.out.println();
		t.printArea();
	}
}
