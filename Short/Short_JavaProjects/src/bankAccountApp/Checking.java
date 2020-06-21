package bankAccountApp;

public class Checking extends Account {
	// List properties specific to a Checking account
	private int debitCardNumber;
	private int debitCardPIN;
	
	
	
	// Constructor to initialize checking account properties
	public Checking(String name, String sSN, double intDeposit) {
		super(name, sSN, intDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
		
	//	System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
	//	System.out.println("NEW CHECKING ACCOUNT");
	//	System.out.println("Name: " + name);
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() + .15;
	}
	

	
	// List any methods specific to the checking account
	private void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
	}
	
	
	
	public void showInfo() {
		super.showInfo();
		System.out.println("ACCOUNT TYPE: CHECKING" + 
							"\n Debit Card Number: " + debitCardNumber +
							"\n Debit Card PIN: " + debitCardPIN
				);
	}
	
}
