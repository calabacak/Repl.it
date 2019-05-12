package day38_ArrayList;

import java.util.*;

public class Contains {
	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();

		list1.add("Jan");
		list1.add("Feb");
		list1.add("Mar");
		list1.add("Apr");
		list1.add("May");
		// ArrayList <String> list2= list1; // if we do it like this they point to the
		// SAME object, in HEAP
		// what ever you do will affect both.

		System.out.println(list1.toString());

		ArrayList<String> months = new ArrayList<>(list1);// constructor, copied all list
		months.add("Jun");
		months.add("Jul");
		months.add("Aug");

		System.out.println(months);
		System.out.println(months.contains("Jan"));// true
		System.out.println(months.contains("Dec"));// false

		System.out.println(months.indexOf("Feb") == 1);
		System.out.println(months.get(1).contentEquals("Feb"));

		ArrayList<String> month1 = new ArrayList<>(list1);
		ArrayList<String> month2 = new ArrayList<>(months);

		System.out.println("Month1: " + month1.toString());
		System.out.println("Month2: " + month2.toString());

		if (month2.containsAll(month1)) {
			System.out.println("every month1 is exist in month2");
		} else {
			System.out.println("some values are missing");
		}
		System.out.println("=====test====");
		
		ArrayList <String> test1= new ArrayList<>();
		test1.add("a");
		test1.add("b");
		test1.add("a");
		test1.add("a");
		ArrayList <String> test2= new ArrayList<>();
		test2.add("a");
		test2.add("b");
		test2.add("c");
		
		System.out.println("Test 1: "+ test1);
		System.out.println("Test 2: "+ test2);
		
		System.out.println(test2.containsAll(test1));
		
	}

}
