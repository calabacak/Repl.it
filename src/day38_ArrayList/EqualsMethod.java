package day38_ArrayList;

import java.util.*;

public class EqualsMethod {
	public static void main(String[] args) {

		List<String> friends1 = new ArrayList<>();
		List<String> friends2 = new ArrayList<>();

		int[] n1 = { 1, 3, 5 };
		int[] n2 = { 1, 3, 5 };
		System.out.println(Arrays.equals(n1, n2));

		friends1.add("Roman");friends1.add("Natalia");friends1.add("Orhan");friends1.add("Elizabeth");
		friends2.add("Roman");friends2.add("Natalia");friends2.add("Orhan");friends2.add("Elizabeth");

		System.out.println(friends1);System.out.println(friends2);

		// syntax friend1.equals(friends2)
		// if they were regular arrays we would write Arrays.equal(friends1, friends2)
		System.out.println(friends1.equals(friends2));
		
		
		//addAll keep the current one and take all the other arrays elements
		
	

	}

}
