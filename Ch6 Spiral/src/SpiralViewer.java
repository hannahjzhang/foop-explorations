
import javax.swing.JFrame;

public class SpiralViewer {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		frame.setSize(400,400);
		frame.setTitle("Spiral");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		SpiralComponent component = new SpiralComponent();
		frame.add(component);
		
		frame.setVisible(true);
	}
}
