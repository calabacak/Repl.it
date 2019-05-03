package day33_methods5;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPracticeByMySelf {
	
	public static void main(String[] args) {
		
		
		
		String [] names =  new String []{"Jon", "Bob", "Cengiz","Gul"};
		
		ArrayList<String> cities= new ArrayList<String>();

		cities.add("Chapel Hill");
		cities.add("Cary");
		cities.add("Durham");
		cities.add("kahramanmaras");
		cities.add("3");
		
		int position= cities.indexOf("Cary");
		
		
		System.out.println(position);

		System.out.println(cities.get(3));
		
		System.out.println(cities.size());
		
		cities.remove(cities.indexOf("Cary"));
		
		for(String s: cities) {
			System.out.println(s);
		}
		
	}
	
	
}
