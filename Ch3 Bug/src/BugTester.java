
public class BugTester {

	public static void main(String[] args) {
		
		Bug bugsy = new Bug(10);
		bugsy.move();
		bugsy.turn();
		bugsy.move();
		System.out.println(bugsy.getPosition());
		System.out.println("Expected 10");
	}
}
