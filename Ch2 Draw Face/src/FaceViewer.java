
// codes for the shapes in the face
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class FaceViewer extends JFrame {

	public FaceViewer () {
		init();
	}
	public void init() {
		setSize(400,400);
		repaint();
	}

	public void paint(Graphics g) {
		g.drawOval(100, 100, 200, 200);
		g.drawOval(150, 150, 20, 20);
		g.drawOval(230, 150, 20, 20);
		g.drawLine(150, 230, 250, 230);
	}
}
