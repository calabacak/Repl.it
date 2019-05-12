package day42_customclasses_encapsulation;

public class MyCoffees {
	public static void main(String[] args) {
		
		Coffee coffee1 = new Coffee();
		coffee1.name="ICED CARAMEL MACCHIATO";
		coffee1.size="GRANDE";
		coffee1.price=4.45;
		coffee1.calories=250;
		coffee1.getCoffeeInfo();
		
		Coffee coffee2 = new Coffee();
		coffee2.setName("JAVA CHIP");
		coffee2.size="VENTI";
		coffee2.price=5.95;
		coffee2.calories=600;
		coffee2.getCoffeeInfo();
		
		Coffee coffee3= new Coffee();
		coffee3.setName("ICED COFFEE");
		coffee3.setSize("TALL");
		coffee3.setPrice(2.45);
		coffee3.setCalories(60);
		coffee3.getCoffeeInfo();
		
		Coffee coffee4= new Coffee();
		coffee4.setCoffeeInfo("FLAT WHITE", "TALL", 3.95, 170);
		coffee4.getCoffeeInfo();
	}

}
