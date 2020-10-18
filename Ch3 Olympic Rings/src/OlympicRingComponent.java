
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

// defines the olympic ring component, a sub class of j component
public class OlympicRingComponent extends JComponent 
{
	/* cannot draw directly on frame, so draw on paint component
	   paint component method contains the instructions for drawing shapes
	*/
	public void paintComponent(Graphics g)
	{
		// changes the background color to white instead of gray
		setOpaque(true);
		setBackground(Color.WHITE);
		
		// Recover Graphics2D so we can use the methods it brings
		Graphics2D g2 = (Graphics2D) g;
		// creates a new ring
		OlympicRing olympicring1 = new OlympicRing(100, 100);
		// draws the ring on Graphics2D
		olympicring1.draw(g2);	
	}
}
