package bankAccountApp;

public class Checking extends Account {
	// List properties specific to a Checking account
	int debitCardNumber;
	int debitCardPIN;
	
	
	
	// Constructor to initialize checking account properties
	public Checking(String name, String sSN, double intDeposit) {
		super(name, sSN, intDeposit);
		accountNumber = "2" + accountNumber;
	//	System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
	//	System.out.println("NEW CHECKING ACCOUNT");
	//	System.out.println("Name: " + name);
	}
	
	
	// List any methods specific to the checking account
	
	public void showInfo() {
		super.showInfo();
		System.out.println("ACCOUNT TYPE: CHECKING");
	}
	
}
