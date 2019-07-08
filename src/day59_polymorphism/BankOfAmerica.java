package day59_polymorphism;

import java.awt.List;
import java.util.ArrayList;

public class BankOfAmerica {
	public static void main(String[] args) {
		
		BankAccount account1 = new BankAccount(5000);
		//2. reference type is an interface
		Account accaunt2= new BankAccount(10000);
		//System.out.println(account1 instanceof Account);
		//System.out.println(accaunt2 instanceof Account);
		
		PayPal paypalaccount1 = new PayPal(0,"sdet@email.com", "12345");
		paypalaccount1.deposit(400);
		
		Account paypalaccount2= new PayPal(100,"user@gmail.com","56234");
		paypalaccount2.withdraw(30);
		
		ArrayList<Account> accounts = new ArrayList<>();
		accounts.add(account1);
		accounts.add(accaunt2);
		accounts.add(paypalaccount1);
		accounts.add(paypalaccount2);
		for(Account a: accounts) {
			System.out.println(a);
		}
		
	}

}
