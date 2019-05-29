package day49_inheritance_02_2;

//You operate several hot dog stands distributed throughout a city.
//- Create a class named HotDogStand that has an instance variable 
//for the hot dog stands ID number and an instance variable 
//for how many hot dogs the stand has sold that day.
//
//- Create a constructor that allows a user of the class to initialize both values.
//
//- Also create a method named justSold that increments by one the number 
//of hot dogs the stand has sold. 
//- The idea is that this method will be invoked each time the stand 
//sells a hot dog so that you can track the total number of hot dogs sold by the stand. 
//- Add another method that returns the number of hot dogs sold.

//Finally, add a static variable "total" that tracks the total number of hot dogs sold by all hot dog stands 
//and a static method that returns the value in this variable.

public class HotDogStand {
	private int ID;
	private int sold;
//	Finally, add a static variable "total" that tracks the total number of hot dogs sold by all hot dog stands 
	private static int total;
	
	//Create a constructor that allows a user of the class to initialize both values.
	public HotDogStand(int ID, int sold) {
		this.ID=ID;
		this.sold=sold;
	}
	
	//method that returns the number of hot dogs sold for every hotdog stand
	public int getSold() {
		return this.sold;
	}
	
	//Also create a method named justSold that increments by one the number 
	//of hot dogs the stand has sold. 
	public void justSold() {
		//sold is for counting sold hotdogs for every hotdog stand individually 
		sold++;
		//total is for counting sold hotdogs for all hotdog stands
		total++;
	}
	
	//and a static method that returns the value in this variable.
	public static int getTotal() {
		return total;
	}
	
	
}