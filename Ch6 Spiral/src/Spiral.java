
import java.awt.Color;
import java.awt.Graphics2D;

public class Spiral {


	private int xCenter;
	private int yCenter;
	

	public Spiral(int x, int y)
	{
		xCenter = x;
		yCenter = y;
	}
	
	public void draw(Graphics2D g2)
	{
		g2.setColor(Color.magenta);
		
		g2.drawLine(xCenter, yCenter, xCenter + 20, yCenter);
		
		int i = 1;
		
		for (i = 1; i < 8; i++)
		{
			int z = i * 20;
			g2.drawLine(xCenter + z, yCenter, xCenter + z, yCenter - z);
			g2.drawLine(xCenter + z, yCenter - z, xCenter - z, yCenter - z);
			g2.drawLine(xCenter - z, yCenter - z, xCenter - z, yCenter + z);
			g2.drawLine(xCenter - z, yCenter + z, xCenter + z + 20, yCenter + z);
			g2.drawLine(xCenter + z + 20, yCenter + z, xCenter + z + 20, yCenter);
		}
		
	}
}