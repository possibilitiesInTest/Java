package bankAccountApp;

public class BankAccountApp {
	
	public static void main(String[] args) {
		
		Checking chkacc1 = new Checking("Tom Wilson", "321456789", 1500);
		
		Savings savacc1 = new Savings("Richard Doe", "456657897", 2500);
		
		// Read a CSV File then create new accounts based on that data
		
		chkacc1.showInfo();
		
		System.out.println("***********");
		
		savacc1.showInfo();
		
	}

}
