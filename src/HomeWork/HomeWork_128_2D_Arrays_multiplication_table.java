package HomeWork;

import java.util.Arrays;

public class HomeWork_128_2D_Arrays_multiplication_table {
	public static void main(String[] args) {
		
		
		int [][] multiplicationTable = new int[10][10];
	    
	    //TODO: type your code below
	    
		for(int row=1; row<=multiplicationTable.length; row++) {
			for(int column=1; column<=multiplicationTable.length; column++) {
				multiplicationTable[row-1][column-1]=row*column;
			  }
		}
		
		
	    
	    //Do not modify below line it will be used to test your code. And 
	    //Can be used by you while developing your code
	    System.out.println(Arrays.deepToString(multiplicationTable) ) ;
	
		
	}

}
