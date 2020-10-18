//Write a class called Die

public class Die {
	private int sides;	// the number of sides
	private int value;	// the current value of the die (whatever is facing
						// up after the die was last rolled)

	// A constructor that takes a number of sides as its input
	public Die(int sides) {
		this.sides = sides;
		
	}

	// A method that randomly generates a number between 1 and the number of sides
	public int roll() {
		
		// generates a random number between 0 or 1, multiples it with sides
		// and converts it to an integer and adds 1 to avoid rolling a 0
		value = (int)(Math.random() * sides) + 1;	
		return value;
	}
}