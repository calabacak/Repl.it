package day53_inheritance06;

public class Cities {
	public static void main(String[] args) {
		
	City city1= new City (123, "Baku");
	City city2= new City(34,"Istanbul");
	City city3= new City(34,"Istanbul");
	

	if(city2.equals(city3)) {
		System.out.println("same");
	}else {
		System.out.println("different");
	}
	
	System.out.println(city1.hashCode());
	System.out.println(city2.hashCode());
	System.out.println(city3.hashCode());
	
	Capital cap= new Capital (46,"kahramanmaras",10000000);
	
	System.out.println(cap.toString());
		
	}

}
