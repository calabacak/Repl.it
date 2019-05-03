package HomeWork;

import java.util.Arrays;

public class HomeWork_117_Arrays_Copy_Certain_values2 {
	public static void main(String[] args) {
		
		
		System.out.println("-----EXAMPLE RUN ---------");
	    String[] numbers = {"zero", "one", "two","three","four"};
	    System.out.println(Arrays.toString(getWithE(numbers)));
	    
	  }
	  
	  
	  
	  public static String[] getWithE(String[] arr) {
	    
	    //TODO : YOUR CODE GOES HERE ----------------------
		  
		  String [] arre = new String[arr.length];
		  int count=0;
		  for(int i=0; i<arr.length; i++) {
			  if(arr[i].contains("e")) {  
				  count++;
				  arre[i]=arr[i];
			  }
		  }
		  
		  String [] fewValues = new String[count];
		  int k=0;
		  for(int i=0; i<arr.length; i++) {
			 
			  if(arre[i]!=null) {
				  fewValues[k]= arre[i];
				  k++;
			  }
		  }
			  
			  
			
	    
	    //YOUR CODE ENDS HERE -----------------------
	    
	    return fewValues;
	  }
	  
	  
	  
	}