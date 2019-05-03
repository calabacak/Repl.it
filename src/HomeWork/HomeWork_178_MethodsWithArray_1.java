package HomeWork;

import java.util.Arrays;

public class HomeWork_178_MethodsWithArray_1 {

	
	
	public static int[] mergR(int[] a,int[] b) {
		
		int [] combined= new int[a.length+b.length];
		
		for(int i=0; i<a.length; i++) {
			combined[i]=a[i];	
		}
	
		for(int i=0; i<b.length; i++) {
			combined[i+a.length]=b[i];	
		}
		
	    return combined;
		   
	    
	  }//end mergR
	  
	  public static void main(String[] args)  {
		  
		  int [] a= {1,3,5,7};
		  int [] b= {2,4,6,8};
		  
		  System.out.println(Arrays.toString(mergR(a,b)));
		  
	   
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	}