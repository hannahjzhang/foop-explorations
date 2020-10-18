
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Area;

public class OlympicRing {
	
	/**
	 * instance variable
	 */
	private int xLeft;
	private int yTop;
	
	/**
	 * constructors
	 * @param x
	 * @param y
	 */
	public OlympicRing(int x, int y)
	{
		xLeft = x;
		yTop = y;
	}
	
	/**
	 * method, draws the rings
	 * @param g2
	 */
	public void draw(Graphics2D g2)
	{
		// draws the blue ring with thickness
		g2.setColor(Color.BLUE);
		Ellipse2D.Double bluering = new Ellipse2D.Double(xLeft, yTop, 50, 50);
		g2.fill(bluering);
		g2.draw(bluering);
		g2.setColor(Color.WHITE);
		Ellipse2D.Double innerbluering = new Ellipse2D.Double(xLeft + 5, yTop + 5, 40, 40);
		g2.fill(innerbluering);
		g2.draw(innerbluering);
		
		// draws the black ring with thickness
		g2.setColor(Color.BLACK);
		Ellipse2D.Double blackring = new Ellipse2D.Double(xLeft + 50, yTop, 50, 50);
		g2.fill(blackring);
		g2.draw(blackring);
		g2.setColor(Color.WHITE);
		Ellipse2D.Double innerblackring = new Ellipse2D.Double(xLeft + 55, yTop + 5, 40, 40);
		g2.fill(innerblackring);
		g2.draw(innerblackring);
		
		// draws the red ring with thickness
		g2.setColor(Color.RED);
		Ellipse2D.Double redring = new Ellipse2D.Double(xLeft + 100, yTop, 50, 50);
		g2.fill(redring);
		g2.draw(redring);
		g2.setColor(Color.WHITE);
		Ellipse2D.Double innerredring = new Ellipse2D.Double(xLeft + 105, yTop + 5, 40, 40);
		g2.fill(innerredring);
		g2.draw(innerredring);
		
		// draws the yellow ring with thickness and clear inner ring
		g2.setColor(Color.YELLOW);
		Ellipse2D.Double yellowring = new Ellipse2D.Double(xLeft + 25, yTop + 25, 50, 50);
		Area area = new Area(yellowring);
		Ellipse2D.Double inneryellowring = new Ellipse2D.Double(xLeft + 30, yTop + 30, 40, 40);
		area.subtract(new Area(inneryellowring));
		g2.fill(area);
		
		// draws the green ring with thickness and clear inner ring
		g2.setColor(Color.GREEN);
		Ellipse2D.Double greenring = new Ellipse2D.Double(xLeft + 75, yTop + 25, 50, 50);
		Area area2 = new Area(greenring);
		Ellipse2D.Double innergreenring = new Ellipse2D.Double(xLeft + 80, yTop + 30, 40, 40);
		area2.subtract(new Area (innergreenring));
		g2.fill(area2);
	}
}