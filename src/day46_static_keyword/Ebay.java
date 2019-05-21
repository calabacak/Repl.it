package day46_static_keyword;

import java.util.ArrayList;

public class Ebay {
	public static void main(String[] args) {
		Customer cm1=new Customer("Abdallah Aleies", "AbdallahAleies@gmail.com");
		Customer cm2=new Customer("ADILET KYRGYZ", "adiletkyrgyz@yahoo.com");
		Customer cm3=new Customer("Anastisiia Zasibna", "anastisiia@outlook.com");
		
		System.out.println(cm1.count);
		System.out.println(Customer.count);
		
		Customer cm4=new Customer("Burak Ucal", "burak@yahoo.com");
		System.out.println(cm3.count);
		System.out.println(Customer.count);
		
		cm1.count=10;
		System.out.println(cm3.count);
		System.out.println(Customer.count);
		
		
		ArrayList<Customer> cs= new ArrayList<>();
		
		cs.add(cm1);
		cs.add(cm2);
		cs.add(cm3);
		cs.add(cm4);
		
		int i=1;
		for(Customer c: cs) {
			System.out.println(c.getName()+" "+i++);
		}
		
		
	}

}
