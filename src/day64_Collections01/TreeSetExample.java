package day64_Collections01;
import java.util.*;

public class TreeSetExample {
	public static void main(String[] args) {
		
		TreeSet<Integer> tSet = new TreeSet<>();
		tSet.add(500);
		tSet.add(100);
		tSet.add(10);
		tSet.add(5);
		tSet.add(8000);
		tSet.add(100);
		System.out.println(tSet);
		
		TreeSet<String> tSet2 = new TreeSet<>();
		tSet2.add("BB");
		tSet2.add("AA");
		tSet2.add("ZZ");
		tSet2.add("BB");
		tSet2.add("EE");
		tSet2.add("DD");
		System.out.println(tSet2);
		
		
	}

}
