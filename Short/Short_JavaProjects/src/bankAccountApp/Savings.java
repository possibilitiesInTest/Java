package bankAccountApp;

public class Savings extends Account {
	// List properties specific to the Savings account
	int safetyDepositBoxID;
	int safetyDepositBoxKey;
	
	// Constructor to initialize settings for the Savings properties
	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();
		// System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
		// System.out.println("NEW SAVINGS ACCOUNT");
		// System.out.println(name);
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() - .25;
	}
	
	private void setSafetyDepositBox() {
		safetyDepositBoxID =(int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}
	
	
	// List any methods specific to savings account
	
	public void showInfo() {
		super.showInfo();
		System.out.println("ACCOUNT TYPE: SAVINGS" + 
						   "\n Safety Deposit Box ID: " + safetyDepositBoxID + 
						   "\n Safety Deposit Box Key: " + safetyDepositBoxKey
				);
	}


}
