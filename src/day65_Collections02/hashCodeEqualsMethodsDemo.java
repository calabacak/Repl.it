package day65_Collections02;

import java.util.Map;
import java.util.*;

public class hashCodeEqualsMethodsDemo {

	public static void main(String[] args) {

		ComparebleInterfarceDemo obj1 = new ComparebleInterfarceDemo(100, "Cengiz");
		ComparebleInterfarceDemo obj2 = new ComparebleInterfarceDemo(200, "Gul");
		ComparebleInterfarceDemo obj3 = new ComparebleInterfarceDemo(100, "Cengiz");
		ComparebleInterfarceDemo obj4 = new ComparebleInterfarceDemo(150, "Ceyda");
		ComparebleInterfarceDemo obj5 = new ComparebleInterfarceDemo(100, "Cengiz");

		Set<ComparebleInterfarceDemo> list1 = new HashSet<>();
		list1.add(obj1);
		list1.add(obj2);
		list1.add(obj3);
		list1.add(obj4);
		list1.add(obj5);

		System.out.println(list1);
		list1.forEach(n -> System.out.println(n));// before generating hashcode and equals it accepts the duplicates
													// once called duplicates are removed
		
		

	}

}
