package ver2;

public class Account {
	// Instance variable, only available inside this class.
	// New comment for balance
	private double balance;
	private String name;
	
	public String getName() {
		return name;
	}


	public Account(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}


	public void setName(String name) {
		this.name = name;
	}
	//methods
	private static void testAccountCreationWithNameAndBalance() {
		System.out.println("-->testAccountCreationWithNameAndBalance()");
		Account a1 = new Account("Ceasar", 1000.0);
		System.out.println("balance should be $1000, balance=$" + a1.getBalance());
		System.out.println("name should be 'Ceasar', name=" + a1.getName());
	}

	private static void testAccountCreationWithBalanceOnly() {
		System.out.println("-->testAccountCreationWithBalanceOnly()");
		Account a1 = new Account(1000.0);
		System.out.println("balance should be $1000, balance=$" + a1.getBalance());
		System.out.println("name should be 'Unknown', name=" + a1.getName());
	}



//merge methods
	private static void testMergeAccount_Successful() {
		System.out.println("-->testMergeAccount_Successful()");
		Account a1 = new Account("Shay", 1000.0);
		Account a2 = new Account("Shay", 500.0);
		a1.mergeAccount(a2);
		System.out.println("balance for a1 should be $1500, balance=$" + a1.getBalance());
	}

	private static void testMergeAccount_Unsuccessful() {
		System.out.println("-->testMergeAccount_Unsuccessful()");
		Account a1 = new Account("Shay", 1000.0);
		Account a2 = new Account("Wren", 500.0);
		a1.mergeAccount(a2);
		System.out.println("balance for a1 should be $1000, balance=$" + a1.getBalance());
	}


	// A "getter" method that simply returns the balance.
	public double getBalance() {
		return balance;
	}
	
// A method that increases the balance by amount
public void deposit(double amount) {
	if(amount>0) {
		balance += amount;
	}
}
// Decreases the balance by amount
public void withdraw(double amount) {
	if(amount > 0 ) {
		balance -= amount;
	}
}
//merge method
public void mergeAccount(Account a) {
	if(this.getName().equals(a.getName())) {
		this.balance += a.getBalance();
	}
}

public void setBalance(double newBal) {
	if(newBal>0.0) {
		balance = newBal;
	}
}
@Override
public String toString() {
	String msg = "name+" + name + ", balance=$" + balance;
	return msg;
}


	// Informal test code
	public static void main(String[] args) {
		Account a1 = new Account(1000.0);
		System.out.println("Balance=$" + a1.getBalance());
		a1.deposit(500.0);
		System.out.println("Balance=$" + a1.getBalance());
		
		a1.withdraw(200.0);
		System.out.println("Balance=$" + a1.getBalance());
		// both of these are "printing an object" - both are the same
		System.out.println(a1.toString());
		System.out.println(a1);
		
		testAccountCreationWithNameAndBalance();
		testAccountCreationWithBalanceOnly();

		testMergeAccount_Successful();
		testMergeAccount_Unsuccessful();


	}
}
