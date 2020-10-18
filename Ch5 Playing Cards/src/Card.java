
public class Card {
	
	private String suit;
	private String value;
	
	public Card(String mySuit, String myValue)
	{
		suit = mySuit;
		value = myValue;
	}
	
	public String findSuit()
	{
		String longName = "";
		switch (suit)
		{
			case "D": longName = "Diamonds"; break;
			case "H": longName = "Hearts"; break;
			case "S": longName = "Spades"; break;
			case "C": longName = "Clubs"; break;
			default: longName = "Unknown"; break;
		}
		return longName;
	}
	
	public String findValue()
	{
		String longName = "";
		switch (value)
		{
			case "2": longName = "Two of"; break;
			case "3": longName = "Three of"; break;
			case "4": longName = "Four of"; break;
			case "5": longName = "Five of"; break;
			case "6": longName = "Six of"; break;
			case "7": longName = "Seven of"; break;
			case "8": longName = "Eight of"; break;
			case "9": longName = "Nine of"; break;
			case "10": longName = "Ten of"; break;
			case "J": longName = "Jack of"; break;
			case "Q": longName = "Queen of"; break;
			case "K": longName = "King of"; break;
			case "A": longName = "Ace of"; break;
			default: longName = "Unknown"; break;
		}
		return longName;

	}
	
	public void getDescription()
	{
		System.out.println(findValue() + " " + findSuit());
	}

}
