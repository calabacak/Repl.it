package day08;

import java.util.Scanner;

public class Checkpositiveornegative {
	
	  public static void main(String[] args) {
		    Scanner s = new Scanner(System.in);
		    int num = s.nextInt();
		    
		    if (num==0)
		    	System.out.println("Zero");
		    
		    else if(num<0)
		    	System.out.println("Negative");
		    
		    else
		    	System.out.println("Positive");
		
	}

}
