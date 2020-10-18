import java.util.Arrays;

public class IntroToArrays {
	
	// simple method, setting amount is a lot more tedious
	// takes in three room names and returns a String with all of them
	public static String listRooms(String rm0, String rm1, String rm2)
	{
		// initialize a variable to hold the string
		String result = "";
		// build the string
		result += rm0 + " " + rm1 + " " + rm2;
		// return the result
		return result;
	}
	
	// complex method using arrays, setting amount is simple
	// takes in an array of strings and returns a single string
	public static String listRooms(String[] rooms)
	{
		// holds the string
		String result = "";
		// build the string using a loop to ensure the whole list is evaluated
		for (int i = 0; i < rooms.length; i++)
		{
			result += rooms[i] + " ";
		}
		return result;
		// special syntax, for-each loop
			// for (String rm : rooms) {
			// result += rm + " "; }
	}
	
	public static void main(String[] args)
	{
		// invoke listRooms() to print specified parameters
		System.out.println
		("The rooms are " + 
		listRooms("bedroom", "kitchen", "garage"));
		
		// invoke using arrays for easy change in size or value
		// create a single reference variable for the array
		String[] rooms = new String[3];
		// update the first three rooms
		rooms[0] = "bedroom";
		rooms[1] = "kitchen";
		rooms[2] = "garage";
		
		// invoke the method to print the rooms array
		System.out.println("The rooms are " + listRooms(rooms));
		
// static method fill() in arrays will fill array with a single value		
//		Arrays.fill(rooms, "bathroom");
// or assigned values to an array from the beginning
//		String[] names = {"bedroom", "kitchen", "garage", "bathroom"};
	}

}
