package day56_abstraction_02;

public class CapitalOne {
	public static void main(String[] args) {
		
		CheckingAccount ca1= new CheckingAccount("Cengiz", true);
		BankAccount ba1 = new BankAccount("Gul Nihal");
		System.out.println(ca1.toString());
		System.out.println(ba1.toString());
		
		ba1.deposit(5900);
		System.out.println(ba1.getBalance());
		ba1.withdraw(6500);
		ca1.deposit(15900);
		System.out.println(ca1.getBalance());
		ca1.withdraw(17000);
		ca1.withdraw(10000);
		ba1.withdraw(10000);
		System.out.println(ca1.getBalance());
		System.out.println(ba1.getBalance());
	}

}
