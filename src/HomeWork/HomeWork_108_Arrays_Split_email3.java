package HomeWork;

import java.util.Scanner;

public class HomeWork_108_Arrays_Split_email3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    String email = input.nextLine();
	    
	    if(!email.contains("@")) {
	    	System.out.println("invalid email");
	   }else if (email.indexOf('@')!=email.lastIndexOf('@')) {
	    
			   System.out.println("invalid email");
	   } else {
	    	
	    	System.out.println("Email id: "+ email.substring(0, email.indexOf('@')));
	    	System.out.println("Email domain: "+ email.substring(email.indexOf('@')+1));
	    }
	    
	  }
	}	