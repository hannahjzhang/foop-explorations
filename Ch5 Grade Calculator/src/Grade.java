import java.util.Scanner;

public class Grade {
	
	public static void main (String[] args) {
		
		// enter the letter grade
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a letter grade");
		
		String grade = in.next();
		String str = ("The numeric value is ");
		
		// check the corresponding grade for that letter
		if (grade.equals("A+"))
			System.out.println(str + "4.0");
		else if (grade.equals("A"))
			System.out.println(str + "4.0");
		else if (grade.equals("A-"))
			System.out.println(str + "3.7");
		else if (grade.equals("B+"))
			System.out.println(str + "3.3");
		else if (grade.equals("B"))
			System.out.println(str + "3.0");
		else if (grade.equals("B-"))
			System.out.println(str + "2.7");
		else if (grade.equals("C+"))
			System.out.println(str + "2.3");
		else if (grade.equals("C"))
			System.out.println(str + "2");
		else if (grade.equals("C-"))
			System.out.println(str + "1.7");
		else if (grade.equals("D+"))
			System.out.println(str + "1.3");
		else if (grade.equals("D"))
			System.out.println(str + "1");
		else if (grade.equals("D-"))
			System.out.println(str + "0.7");
		else
			System.out.println(str + "0");
		
	}

}
