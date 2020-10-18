/**
 * this moth flies to a light source
 * @author hannah
 */
public class Moth {
	/**
	 * instance variable, the one basic function
	 */
	private double position;
	
	/**
	 * constructor, makes a moth and sets the position
	 * @param initialPosition
	 */
	public Moth(double initialPosition)
	{
		position = initialPosition;
	}
	
	/**
	 * makes a function where the moth flies half the distance to the light source
	 * @param lightPosition
	 */
	public void moveToLight(double lightPosition)
	{
		position = (position+lightPosition)/2;
	}
	
	/**
	 * method, turns the position of the moth in the end
	 * @return position of the moth
	 */
	public double getPosition()
	{
		return position;
	}
}