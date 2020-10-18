
public class Main {

	public static void main(String[] args) {
		
		// makes the pie with given values
		PieCutting myPie = new PieCutting (12,10);
		// prints out the area
		System.out.println(myPie.computeArea());
		PieCutting myPie2 = new PieCutting (12,8);
		System.out.println(myPie2.computeArea());
	}
}
