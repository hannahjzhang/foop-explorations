
public class SavingsAccount {
	/**
	 * instance variables
	 */
	private double balance;
	private double interestRate;
	
	/** 
	 * declare constructors, same name as class 
	 * when making a new account, plug in the initial balance and initial interest
	 * @param initialBalance
	 * @param initialInterest
	 */
	public SavingsAccount(double initialBalance, double initialInterest)
	{
		// assignments, initializes the balance and interest
		balance = initialBalance;
		interestRate = initialInterest;
	}
	/** 
	 * method, name is addInterest (what it will be called when need to be invoked) 
	 * denotes the amount interest will be, then denotes balance by adding interest
	 */
	public void addInterest()
	{
		double interest = (interestRate*balance);
		balance = balance + interest;
	}
	/**
	 * self defined method called getBalance, returns the total balance when invoked
	 * @return the current balance
	 */
	public double getBalance()
	{
		return balance;
	}
}