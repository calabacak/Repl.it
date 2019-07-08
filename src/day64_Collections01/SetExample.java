package day64_Collections01;
import java.util.*;
public class SetExample {
	public static void main(String[] args) {
		
		Set<Integer> mySet = new HashSet<>();
		mySet.add(100);
		mySet.add(500);
		mySet.add(800);
		mySet.add(900);
		mySet.add(1000);
		mySet.add(1000);
		mySet.add(1000);
		
		System.out.println(mySet);
		
		//List <String> list = new ArrayList<>();
		List <String> list = Arrays.asList("23","23","a","b","b","22","rr");
		Set<String> unique = new HashSet<>(list);
		System.out.println(unique);
	}

}
