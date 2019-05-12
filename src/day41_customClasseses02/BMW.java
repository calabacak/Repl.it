package day41_customClasseses02;

public class BMW {
	String make= "BMW";
	String model;
	double price;
	
	
	
	public void showPrice() {
		switch(model){
		
		case "330i" :
			price = 40250;
			System.out.println(price);
			break;
		case "740i" :
			price = 86450;
			System.out.println(price);
			break;
		case "m3" :
			price = 66500;
			System.out.println(price);
			break;
		
		default :
			System.out.println(model + " is not available");
			price=0.0;
		}
	}

}
