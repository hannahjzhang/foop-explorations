
public class Triangle {

	private double x1, y1;
	private double x2, y2;
	private double x3, y3;
	
	public Triangle()
	{
		x1 = 0;
		y1 = 0;
		x2 = 0;
		y2 = 0;
		x3 = 0;
		y3 = 0;
	}
	
	public Triangle(double ix1, double iy1, double ix2, double iy2, double ix3, double iy3)
	{
		x1 = ix1;
		y1 = iy1;
		x2 = ix2;
		y2 = iy2;
		x3 = ix3;
		y3 = iy3;
	}
	public void printLength()
	{
		double side1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		double side2 = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
		double side3 = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
		System.out.printf("The length of all sides are %f %f %f", side1, side2, side3);
	}
	
	public void printAngle()
	{
		double a = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		double b = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
		double c = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
		double angle1 = Math.acos(((a * a) + (b * b) - (c * c)) / (2 * a * b));
		double angle2 = Math.acos(((b * b) + (c * c) - (a * a)) / (2 * b * c));
		double angle3 = Math.acos(((c * c) + (a * a) - (b * b)) / (2 * c * a));
		System.out.printf("The measure of all angles are %f %f %f", Math.toDegrees(angle1), Math.toDegrees(angle2), Math.toDegrees(angle3));
	}
	
	public void printPerimeter()
	{
		double side1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		double side2 = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
		double side3 = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
		System.out.printf("The perimeter is %f", side1 + side2 + side3);
	}
	
	public void printArea()
	{
		double side1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		double side2 = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
		double side3 = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
		double perimeter = side1 + side2 + side3;
		double p = perimeter/2;
		double area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
		System.out.printf("The area is %f", area);
	}
}