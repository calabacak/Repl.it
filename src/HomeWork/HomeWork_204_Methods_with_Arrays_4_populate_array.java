package HomeWork;

import java.util.Arrays;

public class HomeWork_204_Methods_with_Arrays_4_populate_array {
	public static void main(String[] args) 
	{
	 
	  
    int [] i= new int[3]; 
    i= populate(i) ;
    System.out.println(Arrays.toString(i));

	}

	public static int[] populate(int[] r) {

		int[] rpop = new int[r.length];

		for (int i = 0; i < r.length; i++) {
			rpop[i] = i+1;
		}
		return rpop;

	}

}
