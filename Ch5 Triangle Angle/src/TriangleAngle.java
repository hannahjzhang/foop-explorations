
public class TriangleAngle {
	
	private double x1, y1;
	private double x2, y2;
	private double x3, y3;
	
	public TriangleAngle()
	{
		x1 = 0;
		y1 = 0;
		x2 = 0;
		y2 = 0;
		x3 = 0;
		y3 = 0;
	}
	
	public TriangleAngle(double ix1, double iy1, double ix2, double iy2, double ix3, double iy3)
	{
		x1 = ix1;
		y1 = iy1;
		x2 = ix2;
		y2 = iy2;
		x3 = ix3;
		y3 = iy3;
	}
	public void printAngle()
	{
		double side1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		double side2 = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
		double side3 = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
		
		double squareHypotenuse = 0;
		double squareSide = 0;
		
		if ((side3 > side2) && (side3 > side1))
		{
			squareHypotenuse = side3 * side3;
			squareSide = (side2 * side2) + (side1 * side1);
		}
		else if ((side2 > side1) && (side2 > side3))
		{
			squareHypotenuse = side2 * side2;
			squareSide = (side1 * side1) + (side3 * side3);
		}
		else 
		{
			squareHypotenuse = side1 * side1;
			squareSide = (side3 * side3) + (side2 * side2);
		}
		
		if (squareHypotenuse > squareSide)
			System.out.println("Obtuse Angle");
		else if (squareHypotenuse < squareSide)
			System.out.println("Acute Angle");
		else
			System.out.println("Right Angle");
		
	}

}
