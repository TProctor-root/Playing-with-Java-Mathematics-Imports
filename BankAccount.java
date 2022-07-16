public class BankAccount {
	private double balance;
	private int cut;
	private double tax;
	private int freebee;
	
	public BankAccount() {
		balance = 0;
		cut = 0;
		tax = 0;
		freebee = 0;
	}
	public BankAccount(double initialBalance, int free) {
		balance = initialBalance;
		cut = free;
	}
	public void deposit(double amount) {
		balance = balance + amount;
		freebee++;
	}
	public void withdraw(double amount) {
		balance = balance - amount;
		freebee++;
	}
	public double getBalance() {
		return balance;
	}
	void setTransactionFee(double fee) {
		tax = fee;
	}
	void deductMonthlyCharge() {
		int moneyA = Math.max(freebee, cut) - cut;
		balance = balance - moneyA * tax;
		freebee = 0;
	}
}