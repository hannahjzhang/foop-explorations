import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the card notation");
		String card = in.next();
	
		String value = card.substring(0,1);
		String suit = card.substring(1,2);
		Card me = new Card (suit, value);
		me.getDescription();

	}

}
