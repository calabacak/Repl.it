package day42_customclasses_encapsulation;

import java.util.*;
import java.lang.*;

public class StringShoesToObject {
	public static void main(String[] args) {
		
		String data ="Brono Magli,9.5";
		String [] arrdata= data.split(",");
		
		Shoes shoes= new Shoes();
		shoes.setShoesData(arrdata[0], Double.parseDouble(arrdata[1]));
		System.out.println(shoes.getShoesData());
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("what shoes brand");
		String brand= scan.next();
		System.out.println("what is your size");
		double size= scan.nextDouble();
		
		Shoes shoes2= new Shoes();
		shoes2.setShoesData(brand, size);
		System.out.println(shoes2.getShoesData());
		
		
		
	}

}
