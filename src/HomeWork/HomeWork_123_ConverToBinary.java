package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork_123_ConverToBinary {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    
	    int decimal = input.nextInt();
	    int[] binary = new int[8];
	    
	    //TODO: Write your code below.
	    
	    int k=binary.length-1;
	    for(int i=0; i<binary.length; i++) {	
	    	int division= (int)(Math.pow(2, k));    	
	    	binary[i]= decimal/division;
	    	
	    	if(decimal/division==1) {
	    		decimal=decimal%division;
	    	}
	    	k--;
	    }
	    
	    
//	    System.out.println(35%128);
//	    System.out.println(35/64);
//	    System.out.println(35/32);
	    
	    System.out.println(Arrays.toString(binary));
	    
	    
	    
	    
	    
	    
	  }
	}