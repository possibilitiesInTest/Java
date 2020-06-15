package bankAccountApp;

public abstract class Account implements IBaseRate {
	// List common properties for savings and checking accounts
	String name;
	String sSN;
	double balance;
	String accountNumber;
	double rate;
	
	
	// Constructor to set base properties and initialize the account
	public Account(String name) {
		System.out.println("Name: " + name);
		System.out.print("NEW ACCOUNT: ");
	}
	
	
	// List common methods
	
}
