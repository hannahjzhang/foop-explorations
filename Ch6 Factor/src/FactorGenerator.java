
public class FactorGenerator {
	
	private int num;
	
	public FactorGenerator(int numberToFactor)
	{
		num = numberToFactor;
	}
	
	public int nextFactor()
	{
		int x = 0;
		
		for (x = 2; x <= num; x++)
		{
			if (num % x == 0)
			{
				num = num / x;
				return x;
			}

		}
		return -1;
	}
	
	public boolean hasMoreFactors()
	{
		int x = 0;
		
		if (num > 1)
			return true;
		else
			return false;
	}

}
