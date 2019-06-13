package day56_abstraction_02;
/*
 * Write a class, BankAccount, containing:
instance variables: name (String), balance (double). 
a constructor accepting a String corresponding to the name of the account holder.
a method, getBalance, that returns a double corresponding to the account balance.
a method withdraw that accepts a double, and deducts the amount from the account balance.

Write a class definition for a subclass, CheckingAccount, that contains:
a boolean instance variable, overdraft. (Having overdraft for a checking account allows one to write checks larger than the current balance).
a constructor that accepts a String and a boolean.

The String parameter is used in the invocation of the superclass (BankAccount) constructor, 
while the boolean is used to initialize the overdraft instance variable.
a method, hasOverdraft, that returns a boolean. hasOverdraft returns true if the account supports overdraft.
a method, clearCheck, that accepts a double and returns a boolean. clearCheck will determine if the amount (of the check) can be cashed-- 
this will be the case if the amount is less than the balance in the account, or if the account allows overdraft. 
If the check can be cashed, clearCheck returns true, and also calls the withdraw method to update the account balance; otherwise, clearCheck returns false.
 */

public class BankAccount {
	
	private String name;
	private double balance;
	
	public BankAccount(String name) {
		this.name=name;
	}
	public void deposit(double balance) {
		this.balance=balance;
	}
	public double getBalance() {
		return balance;
	}
	
	public void withdraw(double amount) {
		this.balance-=amount;
	}

	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", balance=" + balance + "]";
	}
	


}
