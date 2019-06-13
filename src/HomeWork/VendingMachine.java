package HomeWork;
//220. OOP 15 - VendingMachine 2
/*
 * 
In this assignment we will implement DrinkVendingMachine that is based on Abstract class VendingMachine.
 */

public abstract class VendingMachine {
	  
    public abstract void select(int itemNumber);
    public abstract double pay(double money);
    public abstract double returnChange();
    public abstract void cancel();
    
}
