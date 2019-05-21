package day43_Encapsulation_constructor;

import java.util.*;

public class IphoneShop {

	public static void main(String[] args) {

		ArrayList<iPhone> phones = new ArrayList<>();

		iPhone phone1 = new iPhone("iPhone 8 Plus", "Space Gray", 999.99);
		iPhone phone2 = new iPhone("iPhone 8 Plus", "Black", 999.99);
		iPhone phone3 = new iPhone("iPhone 8", "Silver", 799.99);
//		
//		System.out.println(phone1.toString());
//		System.out.println(phone1.getColor().toString());
//		System.out.println(phone2.getPrice());
//		phone2.setPrice(1099.99);
//		System.out.println(phone2.getPrice());

		phones.add(phone1);
		phones.add(phone2);
		phones.add(phone3);

//		for (iPhone p : phones) {
//			if (p.getPrice() == 799.99) {
//				System.out.println(p.getModel());
//			}
//		}
		
		phone1.setColor("Gray");
		System.out.println(phone1.toString());

	}

}
