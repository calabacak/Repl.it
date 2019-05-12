package day38_ArrayList;
import java.util.*;

public class AddAll {
	public static void main(String[] args) {
		
		
		List<String> l1= new ArrayList<>();List<String> l2= new ArrayList<>();
		l1.add("java");l1.add("python");
		l2.add("c#");l2.add("C++");
		System.out.println(l1);System.out.println(l2);
		
//		for(String s:l1) {
//			l2.add(s);
//		}
//		System.out.println(l2);
		
		//or
		l2.addAll(l1);
		System.out.println(l2);
		
		l2.addAll(l1);
		System.out.println(l2);
		
		
		//removeAll opposite of addAll some more
	}

}
