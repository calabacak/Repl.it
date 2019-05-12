package day41_customClasseses02;

public class Test_BankAccount {
	public static void main(String[] args) {
		
		BankAccount ba1= new BankAccount();
		ba1.accountNum=12654;
		ba1.accoutnHolder="cengiz alabacak";
		//ba1.balance=17500;
		
		ba1.deposit(1500);
		ba1.withdraw(500);
		ba1.showBalance();
		
		ba1.charge(350, "wooden spoon");
		ba1.showBalance();
		ba1.showBalance();
	}

}
