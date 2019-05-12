package day40_customclasses_methods;

public class BestBuy {
public static void main(String[] args) {
		
		// we need to create an object first;
		
		CellPhone cell1= new CellPhone();
		cell1.brand= "Nokia 6200";
		cell1.screenSize= 2.0;
		cell1.color= "Silver";
		cell1.price=76.16;
		
		CellPhone cell2= new CellPhone();
		cell2.brand= "Siemens";
		cell2.screenSize= 1.5;
		cell2.color= "Blue";
		cell2.price=39.92;
		
		
		System.out.println(cell1.brand);
		System.out.println(cell1.screenSize);
		System.out.println(cell1.color);
		System.out.println(cell1.price);
		System.out.println("###cell2 VAlue####");
		System.out.println(cell2.brand);
		System.out.println(cell2.screenSize);
		System.out.println(cell2.color);
		System.out.println(cell2.price);
		
		System.out.print(cell1.brand + " is ");cell1.call();
		
		
		
		
	}
	

}
