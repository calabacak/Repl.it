package day65_Collections02;

import java.util.*;

class ComparebleInterfarceDemo_TEST {

	public static void main(String[] args) {

		ComparebleInterfarceDemo obj1 = new ComparebleInterfarceDemo(100, "Cengiz");
		ComparebleInterfarceDemo obj2 = new ComparebleInterfarceDemo(200, "Gul");
		ComparebleInterfarceDemo obj3 = new ComparebleInterfarceDemo(150, "Ceyda");

		List<ComparebleInterfarceDemo> list1 = new ArrayList<>();
		list1.add(obj1);
		list1.add(obj2);
		list1.add(obj3);

		System.out.println(obj1.getClass());

		// Collections.sort(list1)//before implementing i can not sort it.

		Collections.sort(list1);// after I override now Collections.sort works

		System.out.println(list1);

	}

}