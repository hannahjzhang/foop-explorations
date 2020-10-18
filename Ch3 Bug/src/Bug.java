
public class Bug {
	
	/**
	 * instance variable, the essential calls
	 */
	private int position;
	private int direction;
	
	/**
	 * constructor, defines the position and what happens when direction is called
	 * @param initialPosition
	 */
	public Bug(int initialPosition)
	{
		position = initialPosition;
		direction = 1;
	}
	/**
	 * methods turn, move, and get position to be invoked in main
	 */
	public void turn()
	{
		direction = - direction;
	}
	public void move()
	{
		position = (position + direction);
	}
	public int getPosition()
	{
		return position;
	}
}