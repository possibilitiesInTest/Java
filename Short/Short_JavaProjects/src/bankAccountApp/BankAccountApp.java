package bankAccountApp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
	
	public static void main(String[] args) {
		List<Account> accounts = new LinkedList<Account>();

		String file = "C:\\Users\\BaseCamp\\Downloads\\Original.csv";
		
		// Read a CSV File then create new accounts based on that data
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for (String[] accountHolder : newAccountHolders) {
			
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			// System.out.println(name + " " + sSN + " " + accountType + " $" + initDeposit);
			if(accountType.equals("Savings")) {
//				System.out.println("OPEN A SAVINGS ACCOUNT");
				accounts.add(new Savings(name, sSN, initDeposit));
			} else if (accountType.equals("Checking")) {
//				System.out.println("OPEN A CHECKING ACCOUNT");
				accounts.add(new Checking(name, sSN, initDeposit));
			} else {
				System.out.println("ERROR READING ACCOUNT TYPE");
			}
			
			
			for (Account acc : accounts) {
				System.out.println("\n*****************");
				acc.showInfo();
			}
			
//			System.out.println(accountHolder[0]);
//			System.out.println(accountHolder[1]);
//			System.out.println(accountHolder[2]);
//			System.out.println(accountHolder[3]);
		}
		
			
		// UNIT TESTS
		
//		Checking chkacc1 = new Checking("Tom Wilson", "321456789", 1500);
//		
//		Savings savacc1 = new Savings("Richard Doe", "456657897", 2500);
//		
//		// Read a CSV File then create new accounts based on that data
//
//		
//		chkacc1.showInfo();
//		chkacc1.compound();
//
//		System.out.println("***********");
//		savacc1.showInfo();
//		savacc1.compound();
//		
//		
//		// savacc1.deposit(5000);
//		// savacc1.withdraw(200);
//		// savacc1.transfer("Brokerage", 3000);
//		
//		System.out.println("***********");
		
		
				
	}

}
