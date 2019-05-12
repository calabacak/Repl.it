package day38_ArrayList;
import java.util.*;


public class Practise {
	public static void main(String[] args) {
		
		//list, set, map, queue; most popular one is list
		/*
		 * add(type element) or add(index, type element)
		 * get
		 * contains
		 * indexOf
		 * clear
		 * size
		 * remove
		 * isEmpty
		 * set(index, element) overwrite the value at given index
		 * contains
		 * equals
		 * 
		 */
		
		ArrayList<String> arr1 = new ArrayList<>();
		
		arr1.add("cengiz");
		arr1.add("gulnihal");
		arr1.add("ceyda");
		arr1.add("ceren");
		
		
		System.out.println(arr1.toString());
		System.out.println(arr1.contains("ceren"));
		
		
		ArrayList<String> arr2= new ArrayList<>(arr1);// copy arr1 and put it in arr2
		arr2.add("duru");
		System.out.println(arr1.containsAll(arr2));
		System.out.println(arr2.containsAll(arr1));
		System.out.println(arr1.equals(arr2));
		
		System.out.println(arr2);
		//raw ArrayList different types can exist togather;
		ArrayList list = new ArrayList();
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		list1.add("a");
		list1.add("b");
		list1.add("a");
		list2.add("a");
		list2.add("b");
		list2.add("c");
		System.out.println("====");
		System.out.println(list2.contains(list1));
		
	}

}
