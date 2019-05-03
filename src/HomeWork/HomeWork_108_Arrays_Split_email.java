package HomeWork;

import java.util.Scanner;

public class HomeWork_108_Arrays_Split_email {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    String email = input.nextLine();
	    
	   int count = 0;
	    for(int i =0; i<email.length(); i++) {
		   String str1= email.substring(i,i+1);
	    if(str1.contentEquals("@")) {
	    	count++;
	    }
	    }
	    if(count!=1) {
			   System.out.println("invalid email");
	    }
	    
	    else {
	    	
	    	System.out.println("Email id: "+ email.substring(0, email.indexOf('@')));
	    	System.out.println("Email domain: "+ email.substring(email.indexOf('@')+1));
	    }
	    
	  }
	}	