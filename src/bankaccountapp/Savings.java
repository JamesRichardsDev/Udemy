package bankaccountapp;

public class Savings extends Account{
//list properties specific to savings account
	int safetyDepositBoxID;
	int safetyDepositBoxKey;
	
	//constructor to initialize settings for the savings properties
	public Savings(String name,String SSN, double initDeposit) {
		super(name, SSN, initDeposit);
		System.out.println("NEW SAVINGS ACCOUNT");
	}
	//methods specific to savings account
}
