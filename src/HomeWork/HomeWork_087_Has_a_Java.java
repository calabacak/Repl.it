package HomeWork;

import java.util.Scanner;

public class HomeWork_087_Has_a_Java {
	public static void main(String[] args) {
		
	    boolean exists = false;
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    
	    
	    if(word.length()>=4) {
	    	
	    	if(word.substring(0, 4).contentEquals("java") || word.substring(1, 5).contentEquals("java")){
		    	System.out.println(true);
		    }else System.out.println(false);
	    	
	    }else System.out.println(false);
	  }
	}
	


