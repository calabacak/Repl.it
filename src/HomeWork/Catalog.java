package HomeWork;


import java.util.ArrayList;
import java.util.Arrays;

public class Catalog {


	public ArrayList<String> items = new ArrayList<>();
	public ArrayList<Double> prices = new ArrayList<>();
	public ArrayList<Double> monthlyPayments = new ArrayList<>();

	/**
	 * This method adds all listed items to <items> arraylist
	 * that is already declared above
	 */
	public void loadItems() {
		//TODO
		items.add("iPhone 6s");
        items.add("iPhone 6s Plus");
        items.add("iPhone X");
        items.add("MacbookPro");
        items.add("ThumbDrive");
        items.add("Beats HeadPhones");
        items.add("Mouse");
        items.add("Charger");
        items.add("iPad");
        items.add("Dyson Vacuum");
        items.add("TV");
        items.add("Apple Watch");
    
	}
	/**
	 * This method adds all listed prices to <prices> arraylist
	 * that is already declared above
	 */
	public void loadPrices() {
		//TODO
		
		prices.add(449.0);
		prices.add(549.0);
		prices.add(1149.0);
		prices.add(1499.99);
		prices.add(39.99);
		prices.add(349.99);
		prices.add(79.99);
		prices.add(39.99);
		prices.add(429.0);
		prices.add(399.0);
		prices.add(2199.0);
		prices.add(559.0);
		
		
	}
	
	/**
	 * This method adds all listed monthly payments to <monthlyPayments> arraylist
	 * that is already declared above
	 */
	
	public void loadMonthlyPayments() {
		//TODO
		monthlyPayments.add(18.71);
		monthlyPayments.add(22.88);
		monthlyPayments.add(56.16);
		monthlyPayments.add(79.49);
		monthlyPayments.add(2.68);
		monthlyPayments.add(15.12);
		monthlyPayments.add(8.98);
		monthlyPayments.add(4.56);
		monthlyPayments.add(18.31);
		monthlyPayments.add(16.25);
		monthlyPayments.add(89.49);
		monthlyPayments.add(21.18);
		
	}
	
	/**
	 * This method will load whole catalog data - <items>,<prices>,<monthlyPayments>
	 * Call loadItems(),loadPrices(),loadMonthlyPayments() that you created above
	 */
	public void loadWholeCatalog() {
		//TODO
		loadItems();
		loadPrices();
		loadMonthlyPayments();
	}

	/**
	 * Write a method that reads values from above ArrayLists and 
	 * returns a stringbuilder with all item details:
	 * return format(each item in new line and delimited by '-' ):
	 * 	iPhone 6s-449.0-18.71
			iPhone 6s Plus-549.0-22.88
			..
	 * 
	 */
	
	public StringBuilder getWholeCatalog() {
		//LOAD WHOLE CATALOG HERE FIRST
		loadWholeCatalog();
		//TODO
		String[] result = new String[items.size()];
		
		
		
		for (int i = 0; i < items.size(); i++) {
			result[i] = (items.get(i) + "-" + prices.get(i) + "-" + monthlyPayments.get(i)+"\n");
			
		}
		StringBuilder sb = new StringBuilder();
		for(String s1 : result) {
			sb.append(s1);
		}
		
		
		return sb;
		
	}

	/**
	 * write a method that an item name and returns all details for it. If item
	 * is not in the list then returns null
	 *  ex: 
	 * getItemDetails("ThumbDrive") -->ThumbDrive-39.99-2.68 
	 * getItemDetails("Charger") --> Charger-39.99-4.56
	 * getItemDetails("Potato") --> null
	 * 
	 * @param item
	 * @return
	 */

	public String getItemDetails(String item) {
		//LOAD WHOLE CATALOG HERE FIRST
		loadWholeCatalog();
		//TODO
			for (int i = 0; i < items.size(); i++) {
				if (items.get(i).equals(item)) {
					return (items.get(i) + "-" + prices.get(i) + "-" + monthlyPayments.get(i));
				}
			}	
		return null;
	}

	/**
	 * write a method that accepts a price and returns a ArrayList<String> with
	 * items with all detail that have less than or equal monthly payments
	 * 
	 * getItemsLessThanAMonthlyPrice(5.99) --> ThumbDrive-39.99-2.68
	 * 										  Charger-39.99-4.56 
	 * getItemsLessThanAMonthlyPrice(1.99) --> ""
	 * 
	 * @param double price
	 * @return ArrayList<String>
	 */

	public ArrayList<String> getItemsLessThanAMonthlyPrice(double price) {
		//LOAD WHOLE CATALOG HERE FIRST
		loadWholeCatalog();
		
		ArrayList<String> list = new ArrayList<String>();
		
		for (int i = 0; i < items.size(); i++) {
			if (monthlyPayments.get(i) <= price) {
				list.add((items.get(i) + "-" + prices.get(i) + "-" + monthlyPayments.get(i)));
			}
		}

		//TODO
				
		return list;
	}
	
	/**
	 * Method accepts a item name and updates total Price and monthly payments
	 * for that item in <items>,<prices>,<monthlyPayments> arrayLists
	 * When assigning monthlyPayments do =>  newPrice/12 <= to get monthly payments
	 * 
	 * @param item name
	 * @param newPrice
	 */
	
	public void updatePrice(String item, double newPrice) {
		//LOAD WHOLE CATALOG HERE FIRST
		loadWholeCatalog();
		//TODO
		for (int i = 0; i < items.size(); i++) {
			prices.set(i, newPrice);
			monthlyPayments.set(i, newPrice / 12);
		}
	
	}
	
	/**
	 * Method looks for an item in the catalog and removes
	 * all details for that item including item name, price, monthlypayments
	 * 
	 * 
	 * @param item
	 */
	
	public void deleteItemFromCatalog(String item) {
		//LOAD WHOLE CATALOG HERE FIRST
		loadWholeCatalog();
		//TODO
		for (int i = 0; i < items.size(); i++) {
			if (items.get(i).equals(item)) {
				items.remove(i);
				prices.remove(i);
				monthlyPayments.remove(i);
			}
		}
	}
	
	
	

}
