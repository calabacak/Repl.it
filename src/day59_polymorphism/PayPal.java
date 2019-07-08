package day59_polymorphism;

public class PayPal implements Account{
	int balance;
	//String emailreceiver;
	String email;
	String password;
	public PayPal(int balance, String email, String password) {
		super();
		this.balance = balance;
		this.email = email;
		this.password = password;
		//this.emailreceiver=emailreceiver;
	}
	
	@Override
	public int deposit(int amount) {
		balance += amount;
		sendEmail(this.email, "Your balance was increased by "+ +amount+"\nCurrent balance is: "+balance);
		return balance;
	}

	@Override
	public boolean withdraw(int amount) {
		if (amount <= balance) {
			balance -= amount;
			sendEmail(this.email, "You paid "+ +amount+"\nCurrent balance is: "+balance);
			return true;
		}
		//  balance = balance;
		sendEmail(this.email, "Your balance is low, Current balance is: "+this.balance);
		return false;
	}
	
	public void sendEmail(String email, String message) {
		System.out.println("Sending email to: "+ email);
		System.out.println("Email: "+ message);
	}

	@Override
	public String toString() {
		return "PayPal [balance=" + balance + ", email=" + email + ", password=" + password + "]";
	}


}
