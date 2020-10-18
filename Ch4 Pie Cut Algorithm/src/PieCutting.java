
import java.lang.Math;

public class PieCutting {
	
	// instance variables
	private double diameter;
	private double chord;
	
	// default constructors
	public PieCutting()
	{
		diameter = 0;
		chord = 0;
	}
	
	// custom constructor
	public PieCutting(double initialDiameter, double initialChord)
	{
		diameter = initialDiameter;
		chord = initialChord;
	}
	
	// method to compute the area
	public double computeArea()
	{
		double radius = diameter/2;
		double halfc = chord/2;
		double innerheight = Math.sqrt((radius * radius) - (halfc * halfc));
		double h = radius - innerheight;
		double area = (2 * chord * h) / 3 + ((h * h * h) / (2 * chord));
		return area;
	}
}
