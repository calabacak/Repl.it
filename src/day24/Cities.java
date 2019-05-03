package day24;

public class Cities {
	public static void main(String[] args) {
		
		String [] cities = new String [] {"Washington D.C.", "Kiev", "Annandale", "Moscov", "Istanbul","Baku", "Miami"};
		
		for(String city:cities) {
			if(city.startsWith("M"))
				System.out.println(city);
		}

}
}