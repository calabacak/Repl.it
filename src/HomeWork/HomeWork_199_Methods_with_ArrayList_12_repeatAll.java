package HomeWork;

import java.util.ArrayList;

public class HomeWork_199_Methods_with_ArrayList_12_repeatAll {
	
	public static void main(String[] args) {
		ArrayList<String> inputs= new ArrayList<>();
		inputs.add("true");
		inputs.add("false");
		inputs.add("false");
		
		
		System.out.println(repeatAL(inputs));
		repeatALv2(inputs);
		
	}
	//199
	public static ArrayList<String> repeatAL(ArrayList<String> Booleans){
		
		Booleans.addAll(Booleans);
		
		return Booleans;
		
	}
	
	public static void repeatALv2(ArrayList<String> Booleans){
		
		Booleans.addAll(Booleans);
		
		System.out.println(Booleans);
		
	}
	//200
	public static int[] do_switch(int[] i) 
	 {
		int temp=i[0];
		i[0]=i[i.length-1];
		i[i.length-1]=temp;
		
		return i;
		
		

		}

}
