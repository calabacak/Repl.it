package day38_ArrayList;
import java.util.*;


public class RemoveAll {
	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(30);list1.add(12);list1.add(22);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(30);list2.add(345);list2.add(1);
		list2.add(12);list2.add(22);list2.add(12);
		list2.add(120);
		
		System.out.println(list1);
		System.out.println(list2);
		
		// remove all matching values from list1
		list2.removeAll(list1);
		System.out.println(list2);
		list2.addAll(list1);
		System.out.println(list2);
		
		
		
		}
		
	}


