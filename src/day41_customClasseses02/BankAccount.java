package day41_customClasseses02;

public class BankAccount {
	double balance;
	String accoutnHolder;
	int accountNum;
	
	
	public void deposit(double amount) {
		System.out.println("depositing $"+ amount + " to "+accountNum );
		balance+=amount;
	}
	
	public void withdraw(double amount) {
		System.out.println("withdrawing $"+ amount + " from "+accountNum );
		balance-=amount;
		
		if(balance<0) {
			balance-=35;
		}
	}	
		public void showBalance() {
			System.out.println("================");
			System.out.println("Account Holder: "+ accoutnHolder);
			System.out.println("Account Number: "+ accountNum);
			System.out.println("Current Balance: "+ balance);
	}
		
		
		public void charge(double price, String item) {
			
			if(balance<price) {
				System.out.println("you dont have enough balance to buy");
			}else {
				balance=balance-price;
				System.out.println("you are buying "+ item + " your current balance is "+ (balance-price));
			}
		}
		
		
		
		
		
		

}
