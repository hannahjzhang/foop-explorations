
public class MothTester {

	public static void main(String[] args) {
		
		Moth butterfly = new Moth(0);
		butterfly.moveToLight(4);
		butterfly.moveToLight(10);
		System.out.println(butterfly.getPosition());
		System.out.println("Expected 6");
		butterfly.moveToLight(-40);
		System.out.println(butterfly.getPosition());
		System.out.println("Expected -17");
	}
  }
