//need this to use ArrayLists
import java.util.ArrayList;

public class ArrayListExplore {

	public static void main(String[] args) {

// TASK 1: ArrayList methods that you will need to use:  add(), get(), set(), remove(), size()		
		
		
		// a. Create an ArrayList called "names".
	ArrayList<String> names = new ArrayList<String>();

	    // b. Print out the initial size of names.  How does that differ from the initial capacity?
	System.out.println("Initial size of array list: " + names.size());
		// the size is the number of elements in the list
		// the capacity is how many elements the list can
		// potentially accommodate without reallocating its internal structures

	    // c. Add the following String objects to the ArrayList: Amy, Bob, Cindy.
	names.add("Amy");
	names.add("Bob");
	names.add("Cindy");

		// d. Print out the new size of names
	System.out.println("New size is: " + names.size());
	     
		// e. Print out the ArrayList
	System.out.println("The Array List is: " + names);
		
	    // Access and print out each element in names using a for loop (hint: use the get() method)
	for (int i = 0; i < names.size(); i++)
	{
		System.out.print(names.get(i) + " ");
	}
	System.out.println();
	
// BONUS: Do the same thing using a FOR-EACH loop

	    // Replace "Amy" with "Zoe" (hint: use the set() method)
	names.set(0, "Zoe");
	    
	    // Print out the ArrayList again
	for (String x: names)
	{
		System.out.print(x + " ");
	}
	System.out.println();
		
	    // Insert "Valerie" at index 1 (hint: use the add() method)
	names.add(1, "Valerie");
		
		// Now print the contents of names again
	for (String x: names)
	{
		System.out.print(x + " ");
	}
	System.out.println();

	   // Would the following statement work?   names.add(5, "Gertrude");
	// No, five is out of range
	    
	   // Remove the second element
	names.remove(1);

	   // Print the updated ArrayList
	for (String x : names)
	{
		System.out.print(x + " ");
	}
	System.out.println();
	    
	    
// TASK 2 : The value null in a cell counts as data!
//	      An empty cell is not the same as a cell that contains null.
	// INSTRUCTIONS: Type what gets printed out in each case.  Just add in comments.  
	    
	    ArrayList<String> guitars = new ArrayList<String>();

	    System.out.println( "Case A: " + guitars.isEmpty() );
//	PRINTS: Case A: true
	    
	    guitars.add( null );    
	    System.out.println( "Case B: " + guitars.isEmpty() );
//	PRINTS: Case B: false
	    
	    guitars.remove( 0 );  
	    System.out.println( "Case C: " + guitars.isEmpty() );
//	PRINTS: Case C: true
	    
	    guitars.add( "" );    
	    System.out.println( "Case D: " + guitars.isEmpty() );
//	PRINTS: Case D: false
	    
	    guitars.clear( );    
	    System.out.println( "Case E: " + guitars.isEmpty() );
//  PRINTS: Case E: true

	    ArrayList<String> roster = new ArrayList<String>();

	    roster.add( "Amy" );     
	    roster.add( "Bob" );
	    roster.add( "Chris" );   
	    roster.add( "Deb" );
	    roster.add( "Elaine" );  
	    roster.add( "Joe" );
// Predict the output of the 2 print statements below.
// Then uncomment and run the code.
	 // Prediction1: 4
	 // Prediction2: null (actually -1; -1 means false)
	    
	    System.out.println( "First Search: " + roster.indexOf( "Elaine" ) ); 
	    System.out.println( "Second Search: " + roster.indexOf( "Zoe" ) ); 
	    
// TASK 3: Use an enhanced for (FOR-EACH) loop to print out the names of the students in the CS Club.

	    ArrayList<String> csClub = new ArrayList<String>();

	    csClub.add( "Amy" );    csClub.add( "Bob" ); 
	    csClub.add( "Chris" );  csClub.add( "Deb" ); 
	    csClub.add( "Elaine" ); csClub.add( "Frank" );
	    csClub.add( "Gail" );   csClub.add( "Hal" );

	    for (String x : csClub)
	    {
	    	System.out.print(x + " ");
	    }

	}
}
