
import java.awt.Color;
import javax.swing.JFrame;

public class OlympicRingViewer {

	public static void main(String[] args) 
	{
		// creates a new frame
		JFrame frame = new JFrame();
		
		// sets the neccesities for the frame
		frame.setSize(350, 300);
		frame.setTitle("Olympic Ring Model");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// create the olympic ring component so that it is added to the frame
		OlympicRingComponent component = new OlympicRingComponent();
		frame.add(component);
		
		// make it visible
		frame.setVisible(true);
	}
}