package bankaccountapp;

public class Checking extends Account {
// list properties specific to checking account
	int debitCardNumber;
	int debitCardPin;

	// Constructor to initialize the checking account
	public Checking(String name, String SSN, double initDeposit) {
		super(name, SSN, initDeposit);
		System.out.println("NEW CHECKING ACCOUNT");
	}

	// List any methods specific to the checking account

}
