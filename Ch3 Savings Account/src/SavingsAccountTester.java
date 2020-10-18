
public class SavingsAccountTester {

	public static void main(String[] args) {
		
		SavingsAccount Hannahmoney = new SavingsAccount(1000,0.1);
		Hannahmoney.addInterest();
		System.out.println(Hannahmoney.getBalance());
		System.out.println("Expected 1100");
	}
}
