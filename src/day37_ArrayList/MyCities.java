package day37_ArrayList;

import java.util.*;

public class MyCities {
	public static void main(String[] args) {

		ArrayList<String> myCities = new ArrayList<>();

		myCities.add("Kahramanmaras");
		myCities.add("Ankara");
		myCities.add("Istanbul");
		myCities.add("Barnaul");
		myCities.add("Baku");
	
		if(myCities.contains("Ankara"))
			System.out.println("hello");
		
		myCities.set(2,"Seoul");
		myCities.set(myCities.indexOf("Ankara"),"Seoul");
		
		myCities.add(0, "Adana");
		

		for (String city : myCities) {
			System.out.print(city + " ");
		}
System.out.println();
		for (int i = 0; i < myCities.size(); i++) {
			System.out.println(myCities.get(i));
		}

	}

}
