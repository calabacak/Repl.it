package day65_Collections02;

import java.util.*;

public class LambaAndForEachDemo {
	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();

		list1.add(11);
		list1.add(23);
		list1.add(23);
		list1.add(36);
		list1.add(45);
		list1.add(23);
		list1.add(23);
		list1.add(23);
		list1.add(18);

		System.out.println("before any maniplation)");
		System.out.println(list1);
		
//		Collections.sort(list1);
//		System.out.println("sorted by Collections.sort(list1)");
//		System.out.println(list1);

		System.out.println("--for--each-- loop");
		for (Integer i : list1) {
			System.out.println(i);
		}

		System.out.println("--for--loop");
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}

		System.out.println("__forEach() and lambda__");

		list1.forEach(n -> System.out.println(n));

//		System.out.println("try to remove by for each ConcurrentModificationException");
//		
//		for (Integer i : list1) {
//			if (i == 23) {
//				list1.remove(i);
//			}
//		}
//		System.out.println(list1);

		
//		System.out.println("remove by Iterotor works perfect");
//		Iterator <Integer>it = list1.iterator();
//		while(it.hasNext()) {
//			int value= it.next();		
//			if(value==23) {
//				it.remove();
//			}
//		}
		
		
		System.out.println(list1);
			
		
//		System.out.println("try to remove by loop and it works but if we don use i-- can miss");
//		for (int i = 0; i < list1.size(); i++) {
//			if (list1.get(i) == 23) {
//				list1.remove(list1.get(i));
//				//i--;
//			}
//		}
//		System.out.println(list1);
		
		System.out.println("________lamba remove______");
		
		list1.removeIf(n-> n==23);
		
		System.out.println(list1);
	}
	
	
	

}
