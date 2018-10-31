package bankaccountapp;

public abstract class Account implements IBaseRate {
// List Common Properties for savings and checking accounts
	String name;
	String SSN;
	double balance;

	String accountNumber;
	double rate;

	// Constructor to set base properties and initialize the account
	public Account(String name, String SSN, double initDepost) {
		this.name = name;
		this.SSN = SSN;
		this.balance = initDepost;
		System.out.println("NAME: = " + name + " SSN: " + SSN + " BALANCE: " + balance);

	}

	// List Common methods

}
