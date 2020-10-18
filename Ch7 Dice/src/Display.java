
public class Display {
	// Create an array field called results that can hold 25 ints
	int[] results = new int[25];

	public Display () {
		init();
	}

	public void init() {
		computeResults();
	}

	public void computeResults() {
		final int TRIALS = 1000;

		// Create an array called die to hold 4 six-sided Die objects.
		Die[] die = new Die[4];
		
		// Create the Die objects and store them in the die array.
		Die die0 = new Die(6);
		Die die1 = new Die(6);
		Die die2 = new Die(6);
		Die die3 = new Die(6);
		die[0] = die0;
		die[1] = die1;
		die[2] = die2;
		die[3] = die3;

		// Roll the 4 dice TRIALS times and tally the totals in the results array.
		for(int i = 0; i < TRIALS; i++)
		{
			// rolls each die
			die0.roll();
			die1.roll();
			die2.roll();
			die3.roll();
			
			// sums up the total number rolled by the die
			int sum = die0.roll() + die1.roll() + die2.roll() + die3.roll();
			// adds one to the number of the sum in the array
			results[sum] = results[sum] + 1;
;		}

		// Print the results with a single space separating each total.
		for(int i = 0; i < results.length; i++)
		{
			System.out.print(results[i] + " ");
		}
		
	}

}