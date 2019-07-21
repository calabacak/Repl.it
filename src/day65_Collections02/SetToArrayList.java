package day65_Collections02;
import java.util.*;

public class SetToArrayList {
	public static void main(String [] args) {
		Set<String> listSet = new HashSet<>();
		listSet.add("Cengiz");
		listSet.add("GulNihal");
		listSet.add("Ceyda");
		listSet.add("Ceren");
		listSet.add("Duru");
		listSet.add("Alber");
		listSet.add("qwer");
		listSet.add("aaaaq");
		
		
//		for(String s: listSet) {
//			System.out.println(s);
//		}
		
		List<String> listArr= new ArrayList<>(listSet);
		
		System.out.println(listArr.get(0));
		
	}

}
