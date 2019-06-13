package HomeWork;

import java.util.ArrayList;

public class HomeWork_222_Methods_with_ArrayList_16_2Times {
	
	public static ArrayList<Integer> twoTimes(ArrayList<Integer> r){
		
		
		ArrayList<Integer> r2= new ArrayList<>();
		
		for(int i=0; i<2*r.size();i++) {
			r2.add(r.get(i));
			r2.add(r.get(i));
			
		}	
return r;
}
}