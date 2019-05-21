package day38_ArrayList;
import java.util.*;

public class MethodsSummary2 {
	public static void main(String[] args) {
		
		
		List<String> list1 = new ArrayList<>();
		list1.add("red");
		list1.add("blue");
		list1.add("white");
		list1.add("grey");
		list1.add("black");
		//add method
		System.out.println(list1.toString());
		
		//toString method
		list1.add(0,"yellow");
		System.out.println(list1.toString());
		
		//size() method
		System.out.println(list1.size());
		
		//get() method
		System.out.println(list1.get(0));
		
		//remove() using index
		list1.remove(0);
		System.out.println(list1);
		list1.remove("blue");// removes the first occurence
		System.out.println(list1);
		
		// set () method , replace the old value at the specified index with the new value
		list1.set(0, "orange");
		System.out.println(list1);
		
		// indexOf(value)
		System.out.println(list1.indexOf("grey"));
		
		// isEmpty	
		System.out.println(list1.isEmpty());
		
		//contains
		System.out.println("white in list1? "+ list1.contains("white"));
		
		List<String> list2= new ArrayList<>();
		//addAll
		list2.addAll(list1);
		System.out.println(list2);
		
		//containsAll
		System.out.println("contains all: "+list1.containsAll(list2));
		
		
		//equals method check if two lists are equal
		System.out.println("are they equal? "+ list1.equals(list2));
		
		list2.add("pink");
		
		list2.removeAll(list1);
		System.out.println(list2);
		
		//addAll adds a new list values starting from given index
		
		list2.addAll(0, list1);
		System.out.println(list2);
		list1.clear();
		list2.clear();
		System.out.println(list1.size());
		System.out.println(list2.size());
		System.out.println(list1.isEmpty());
		System.out.println(list2.isEmpty());
		
		
		String [] strArr = {"Ahmet", "Ali","Cengiz", "GulNihal"};
		int [] intArr = {1,2,3,4,5,6,7};
		
		List<Integer> list3 =Arrays.asList(3,4,5,6,7,8);
		
		List<Integer> list5= list3.subList(1, 4);
		
		List<String> list4= Arrays.asList(strArr);
		list4.set(1, "mehmet");
		
		
		System.out.println(list3);
		//System.out.println(list4);
		System.out.println(list5);
		

		
	}

}
