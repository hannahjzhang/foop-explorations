/**
 * constructs a new frame for the drawing to be in
 */
import javax.swing.JFrame;

public class TargetViewer {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		frame.setSize(300,300);
		frame.setTitle("5 Ring Target");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		TargetComponent component = new TargetComponent();
		frame.add(component);
		
		frame.setVisible(true);
	}
}
