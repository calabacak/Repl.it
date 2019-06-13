package MAP_Cengiz;

import java.util.HashMap;
import java.util.Map;

public class Map_intro {
	public static void main(String[] args) {
		
		Map<String, String > language= new HashMap<>();
		
		language.put("en", "english");
		language.put("tur", "turkish");
		language.put("ger", "german");
		
		//System.out.println(language.get("tur"));
		
		language.put("tur", "turkmenistan");
		//System.out.println(language.get("tur"));
		
		
		Map<Integer, String> list1= new HashMap<>();
		
		list1.put(1, "cengiz alabacak");
		list1.put(5, "gulnihal alabacak");
		list1.put(3, "ceyda alabacak");
		list1.put(4, "ceren alabacak");
		list1.put(2, "duru alabacak");
		
		list1.remove(3);
		
		for(Integer key: list1.keySet()) {
			System.out.println(key+" : "+list1.get(key));
		}
		
		System.out.println("===================");
		
	
		
		
		
		
		
	}

}
