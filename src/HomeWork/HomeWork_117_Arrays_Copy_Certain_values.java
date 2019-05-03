package HomeWork;

import java.util.Arrays;

public class HomeWork_117_Arrays_Copy_Certain_values {
	public static void main(String[] args) {
		
		
		System.out.println("-----EXAMPLE RUN ---------");
	    String[] numbers = {"zero", "one", "two","three","four"};
	   
	    

		  
		  String [] arre = new String[numbers.length];
		  int count=0;
		  for(int i=0; i<numbers.length; i++) {
			  if(numbers[i].contains("e")) {  
				  count++;
				  arre[i]=numbers[i];
			  }
		  }
		  
		  String [] arrek = new String[count];
		  //System.out.println(arre[2].length());
		//  System.out.println(Arrays.toString(arre));
//		  System.out.println(count);
		  int k=0;
		  for(int i=0; i<numbers.length; i++) {
			 
			  if(arre[i]!=null) {
				  arrek[k]= arre[i];
				  k++;
			  }
		  }
		  
		  System.out.println(Arrays.toString(arrek));
//		  
		  
		  
		  
		  
		  
		  
		  
		 // String [] fewValues= new String[count];
		  
//		
			  
			  
			

	  
	}
	  
	}