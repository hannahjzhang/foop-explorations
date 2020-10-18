/**
 * lists the instructions to create a target
 */
/**
 * imports the needed things to make graphics
 */
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Target {

	/**
	 * instance variables, x and y are the basic functions
	 */
	private int xLeft;
	private int yTop;
	
	/**
	 * constructors, makes a target with coordinates x and y
	 * @param x
	 * @param y
	 */
	public Target(int x, int y)
	{
		xLeft = x;
		yTop = y;
	}
	
	/**
	 * method, draws the rings of the target one by one based on the given coordinates
	 * @param g2
	 */
	public void draw(Graphics2D g2)
	{
		g2.setColor(Color.BLACK);
		Ellipse2D.Double outerring = new Ellipse2D.Double(xLeft, yTop, 50, 50);
		g2.fill(outerring);
		g2.setColor(Color.WHITE);
		Ellipse2D.Double secondring = new Ellipse2D.Double(xLeft + 5, yTop + 5, 40, 40);
		g2.fill(secondring);
		g2.setColor(Color.BLACK);
		Ellipse2D.Double thirdring = new Ellipse2D.Double(xLeft + 10, yTop + 10, 30, 30);
		g2.fill(thirdring);
		g2.setColor(Color.WHITE);
		Ellipse2D.Double fourthring = new Ellipse2D.Double(xLeft + 15, yTop + 15, 20, 20);
		g2.fill(fourthring);
		g2.setColor(Color.BLACK);
		Ellipse2D.Double innerring = new Ellipse2D.Double(xLeft + 20, yTop + 20, 10, 10);
		g2.fill(innerring);
	
		/**
		 * sets the target to be visible
		 */
		g2.draw(outerring);
		g2.draw(secondring);
		g2.draw(thirdring);
		g2.draw(fourthring);
		g2.draw(innerring);
	}
}