package day64_Collections01;
import java.util.*;

public class VectorExample {
	public static void main(String[] args) {
		List<String> v = new Vector<>();
		v.add("Cengiz");
		v.add("Gul Nihal");
		v.add("Ceyda");
		v.add("Ceren");
		v.add("Duru");
		Vector<String> ve = new Vector<>();
	
		
		//threadsafe, sycnronized
		
		for(String str: v) {
			System.out.println(str);
		}
		
	}

}
