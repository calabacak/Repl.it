package day53_inheritance06;

public class TestHiding {
	public static void main(String[] args) {
		
		City city1= new City(345,"London");
		Capital cap1= new Capital(456,"Paris",3456789);
		
		System.out.println(city1.count);
		System.out.println(cap1.count);
		
		System.out.println(city1.toString());
		System.out.println(cap1.toString());
		cap1.buildARoad();
		//=========
		
		City city2 = new City(4561,"Fairfax");
		Capital cap2= new Capital(2345,"Richmond", 9734123L);
		city2.buildARoad();
		cap2.buildARoad();
		
	}
 
}
