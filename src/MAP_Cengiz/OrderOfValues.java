package MAP_Cengiz;
import java.util.*;

public class OrderOfValues {
	public static void main(String[] args) {
		
		HashMap <String, String> list1= new HashMap<>();
		
		list1.put("ner", "Ceren");
		list1.put("ner", "Ceren");
		list1.put("zig", "Cengiz");
		list1.put("lg","Gul");
		list1.put("qqady", "Ceyda");
		list1.put("ur", "Duru");
		
		for(String i: list1.keySet()) {
			System.out.println(i+" "+list1.get(i));
		}
		
		
		
				
		
		
	}
	
	

}
