package day64_Collections01;
import java.util.*;

public class LinkedListExample {
	public static void main(String[] args) {
		
		List <Integer> list = new LinkedList<>();
		LinkedList <Integer> list2 = new LinkedList<>();
		
		list.add(50);
		list.add(78);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		list2.add(350);
		list2.add(783);
		list2.add(540);
		list2.add(781);
		list2.add(781);
		list2.add(781);
		System.out.println(list2.getFirst());
		System.out.println(list2.getLast());
		list2.addFirst(129);
		System.out.println(list2);
	}

}
