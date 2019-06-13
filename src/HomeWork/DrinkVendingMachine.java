package HomeWork;

import java.util.*;

public class DrinkVendingMachine extends VendingMachine {

	/**
	 * HAS-A relation DrinkVendingMachine HAS-A list of Drink objects
	 */
	public List<Drink> drinks;

	/**
	 * current will refer to currently selected drink
	 */
	public Drink current;
	/**
	 * after selecting the drink, whatever amount customer owes for the drink
	 */
	public double amountLeftToPay;
	/**
	 * after paying for the drink whatever amount is change
	 */
	public double change;
	/**
	 * used to check if drink is currently selected or no
	 */
	public boolean isSelected;

	/**
	 * public constructor.
	 * 
	 * @param drinksParam VAR-ARGs. Assign each Drink object into drinks list
	 */
	public DrinkVendingMachine(Drink... drinksParam) {
		// drinks.add((Drink) Arrays.asList(drinksParam));
		drinks = Arrays.asList(drinksParam);
	}
/*
 * public DrinkVendingMachine(Drink... drinksParam) {
      drinks= new ArrayList<>();
      for(Drink d: drinksParam){
        drinks.add(d);
      }
 */
	/**
	 * Override select abstract method. This method will be used to select a drink
	 * in the vending machine
	 * 
	 * @param drinkNumber to select in Vending machine options are 0 to
	 *                    drinks.size-1 1. if drinkNumber is < 0 or more than
	 *                    drinks.size-1 then isSelected should be false 2. if a
	 *                    drink's quantity at that position is <=0 then isSelected
	 *                    should be false 3. Set the drink object at that index to
	 *                    current variable 4. Set the cost of the selected drink to
	 *                    amountLeftToPay variable 5. Set isSelected to true
	 *
	 */

	// TODO: implement select method

	@Override
	public void select(int drinkNumber) {
		if (drinkNumber < 0 || drinkNumber > drinks.size() - 1 || drinks.get(drinkNumber).getQuantity() <= 0) {
			isSelected = false;
		} else {
			current = drinks.get(drinkNumber);
			amountLeftToPay = drinks.get(drinkNumber).getCost();
			isSelected = true;
		}
	}

	/**
	 *
	 * Override abstract method pay Method is used to pay for the selected drink
	 *
	 * 1. If isSelected is false then return 0.0 2. Deduct money from
	 * amountLeftToPay 3. if there is any change set the value to change variable
	 * (positive value) 4. Decrease the quantity of the selected drink by 1 5.
	 * Return amountLeftToPay value
	 *
	 * @param money
	 *
	 */
	// TODO: implement pay method

	@Override
	public double pay(double money) {
		//current.setQuantity(current.getQuantity()-1);
		// money 5
		// amountLeftToPay -2,65;
		//change 2.35;
		
		if(isSelected==false) {
			return 0.0;
		}
			amountLeftToPay-=money; 
			if(amountLeftToPay<=0) {
				change=Math.abs(amountLeftToPay);
				current.setQuantity(current.getQuantity()-1);
			}

			return amountLeftToPay;
		
		
		
	}
/*
 * public double pay(double money){
       
        if(!isSelected){
          return 0.0;
        }
       
               amountLeftToPay -= money;
              if(amountLeftToPay<=0) {
            	  change =Math.abs(amountLeftToPay);
            	  current.setQuantity(current.getQuantity()-1);
            
              }
            			  return amountLeftToPay;
            		  
     }
 */
	/**
	 * Override abstract method returnChange Method is used to return the change to
	 * the customer Return the value of change from the method and 1. Set change to
	 * 0 2. Set amountLeftToPay to 0
	 *
	 * @return
	 */

	// TODO: implement returnChange method

	@Override
	public double returnChange(){
	     double changeNew = change;
	      change =0;
	      amountLeftToPay=0;
	      return changeNew;
	   }

	/**
	 * Override abstract method cancel Method is used by customers to cancel any
	 * selected drinks 1. set current drink to null 2. amountLeftToPay is zero 3.
	 * isSelected to false 4. return any changes
	 */

	// TODO: implement cancel method
	@Override
	public void cancel(){
	     change = 0.0;
	     current = null;
	     amountLeftToPay=0;
	     isSelected =false;
	       
	    }

}
