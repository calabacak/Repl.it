package Most_Frequent_Coding_Questions;

import java.util.*;

public class TestYourSelfMF {
	public static void main(String[] args) {
		
		
		HashSet<String> hs =new HashSet();
		//HashMap<String>
		
		hs.add("Cengiz");
		hs.add("GulNihal");
		hs.add("Ceren");
		hs.add("Ali");
		hs.add("Zeynep");
		//hs.remove("Cengiz");
		
		Iterator<String> it= hs.iterator();
		int i=0;
	while(it.hasNext()) {
		
	
			System.out.println(it.next());
		
		
		i++;
		
	}
		
		//System.out.println(hs.size());
		
		
		
		
		System.out.println(hs);
		
	}

	

}
