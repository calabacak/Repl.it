package day39_ArrayList4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cities {
	public static void main(String[] args) {
ArrayList<String> cities = new ArrayList<>();
        
        cities.add("Tokyo");
        cities.add("New York");
        cities.add(0,"Paris");
        cities.add("Pittsburgh");
        cities.add(1,"Berlin");
        cities.add("Madrid");
        cities.add("Moscow");
        cities.add("Istanbul");
        cities.add("Washington D.C.");
        cities.add("Amsterdam");
        cities.add("Zurich");
        cities.add("Singapore");
        cities.add("Milan");
        cities.add("Toronto");
        cities.add("London");
        cities.add("Lima");
        
        for(String s: cities) {
        	System.out.print(s+"|");
        }
        System.out.println();
        for(int i=0; i<cities.size();i++) {
        	System.out.print(cities.get(i)+"|");
        }
        System.out.println();
        for(int i=0; i<cities.size();i++) {
        	System.out.print(cities.get(i).toUpperCase()+"|");
        }
        System.out.println();
        for(int i=0; i<cities.size();i++) {
        	cities.set(i, cities.get(i).toUpperCase());
        }
        System.out.println(cities);
        
        
        //find the longest city and shortest city;
//        does not work like this
//        String maxCity= Collections.max(cities);
//        String minCity= Collections.min(cities);
//        System.out.println(maxCity);
//        System.out.println(minCity);
//        int max=0;

        	
        String longestCity= "";
        
        for(String city: cities) {
        	if(city.length()>longestCity.length()) {
        		longestCity= city;
        	}
        }
       
        String ShortestCity= cities.get(0);
        for(String city: cities) {
        	if(city.length()<longestCity.length()) {
        		ShortestCity= city;
        	}
        }
        
        System.out.println("longest city is: "+ longestCity );
        System.out.println("shortes city is: "+ ShortestCity );
        
        // find the cities with 6 letters
        List <String> citiesWith6letters = new ArrayList<>();
        
        for(String city: cities) {
        	if(city.length()>6) {
        		System.out.print(city+" | ");
        		citiesWith6letters.add(city);
        	}
        }
        System.out.println();
        System.out.println(citiesWith6letters);
	}

}
