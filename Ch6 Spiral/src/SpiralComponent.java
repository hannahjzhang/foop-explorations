
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class SpiralComponent extends JComponent
{
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		Spiral spiral1 = new Spiral(200,200);
		spiral1.draw(g2);
	}
}