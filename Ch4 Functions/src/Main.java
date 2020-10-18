
public class Main {

	public static void main(String[] args) {
		
		String x = "Hannah Zhang";
		
		// prints the first letter
		System.out.println(x.charAt(0));
		
		// prints the last letter
		int len = x.length();
		int y = len - 1;
		System.out.println(x.charAt(y));
		
		// removes the first character, allowed to omit end position
		System.out.println(x.substring(1));
		
		// removes the last character
		int z = x.length();
		System.out.println(x.substring(0, z-1));
	}
}
