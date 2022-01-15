package ver1;

public class Account {
	// Instance variable, only available inside this class.
	private double balance;
	// constructor
	public Account(double initBalance) {
		balance = initBalance;
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
public void setBalance(double newBal) {
	if(newBal>0.0) {
		balance = newBal;
	}
}
@Override
public String toString() {
	String msg = "balance=$" + balance;
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

	}
}
