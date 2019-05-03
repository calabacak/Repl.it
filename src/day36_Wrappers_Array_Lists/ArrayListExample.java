package day36_Wrappers_Array_Lists;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		
		
		ArrayList<String> languages = new ArrayList<>();
		String [] arr= {"AB", "CD"};
		languages.add("Java");
		languages.add("Englis");
		languages.add("Spanish");
		languages.add("Arabic");
		languages.add("Russion");
		languages.add("Azerbaijani");
		languages.add("Ukranian");
		
		System.out.println(languages.size());
		languages.add("Turkish");
		languages.add(arr[0]);
		System.out.println(languages.size());
	}
	
}
