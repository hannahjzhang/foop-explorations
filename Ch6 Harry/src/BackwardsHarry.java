
public class BackwardsHarry {
	
	public static void main(String[] args) {
		
		int x = 0;
		String z = "Harry";
		String a = "Harry";
		
		for (x = 0; x < a.length(); x++)
		{
			System.out.print(z.substring(z.length()-1));
			z = a.substring(0, z.length()-1);
		}
		
		
	}

}
