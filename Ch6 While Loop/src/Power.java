
public class Power {
	
	public static void main(String[] args) {
		
		int n = 100;
		int i = 0;
		
		while (Math.pow(2, i) < n)
		{
			System.out.println(" " + Math.pow(2, i) + " ");
			i = i + 1;
		}
	}
}
