
public class PrimeGenerator {
	
	private int num; 
	
	public PrimeGenerator(int number)
	{
		num = number;
	}
	
	public void printPrime()
	{
		int x = 0;
		
		for (x = 2; x <= num; x++)
		{
			if (isPrime(x))
			{
				System.out.println(x);
			}
		}
		
	}
	
	public boolean isPrime(int num)
	{
		int x = 0;
		
		for (x = 2; x < num; x++)
		{
			if (num % x == 0)
			{
				return false;
			}
		}
		return true;
	}

}
