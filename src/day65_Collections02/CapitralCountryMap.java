package day65_Collections02;

import java.util.*;

public class CapitralCountryMap {
	public static void main(String[] args) {

		Map<String, String> cc = new HashMap<>();
		
		// put(key, value) add the key and value to the list

		cc.put("Ankara", "Turkey");
		cc.put("Moscov", "Russia");
		cc.put("Ankara", "Turkey");
		cc.put("Washington", "US");
		cc.put("Berlin", "Germany");
		cc.put("London", "Britain");

		
		//get()  prints the value of the specified key
		System.out.println(cc.get("Ankara"));

		//keySet() prints keys only 
		for (String s : cc.keySet()) {
			System.out.println(s);
		}

		//values() prints keys only 
		for (String s : cc.values()) {
			System.out.println(s);
		}

		//prints keys and values together
		for (String s : cc.keySet()) {
			System.out.println(s + " | " + cc.get(s));
		}

	}

}
