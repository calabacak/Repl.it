package HomeWork;

import java.util.Scanner;

public class HomeWork072_Email_1 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String email = scan.next();
	  //  input: mike_tyson@gmail.com
	  //  output: tyson_mike@gmail.com
	    
	    if(email.contains("_")) {
	    String lastname= email.substring(email.indexOf('_')+1,email.indexOf('@'));
	    String name= email.substring(0, email.indexOf('_'));
	    String address = email.substring(email.indexOf('@'));
	    
	    System.out.println(lastname+ "_" +name+""+address);
	    
	    }else
	    	System.out.println(email);
	    
	  }
	}


