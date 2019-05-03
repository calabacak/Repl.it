package HomeWork;

import java.util.Scanner;

public class HomeWork_145_Methods_7_plus_minus {

	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    int size = inp.nextInt();
	    int[] arr = new int[size];
	    for(int i=0 ;i<=size-1;i++)
	    {

	        arr[i]=inp.nextInt();
	    }
	    
	    plus_minus(arr);
	  }//end main
	
	public static void plus_minus(int[] arr) {
		int countp=0;
		int countn=0;
		int countz=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>0) {
				countp++;
			}else if (arr[i]<0) {
				countn++;
			}else {
				countz++;
			}
		}
		
		System.out.println("positives:"+countp+", negatives:"+countn+", zeros:"+countz);
	}
	  
	  
	  
	}
