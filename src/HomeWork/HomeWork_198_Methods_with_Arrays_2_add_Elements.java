package HomeWork;
import java.util.*;

public class HomeWork_198_Methods_with_Arrays_2_add_Elements {
	
	public static int[] addElements(int[] ints1, int[] ints2) {
		
		int [] result= new int[ints1.length];
		
		for(int i=0; i<ints1.length; i++) {
			result[i]= (ints1[i]+ints2[i]);
		}
	    
	    return result;
	    
	  }

}
