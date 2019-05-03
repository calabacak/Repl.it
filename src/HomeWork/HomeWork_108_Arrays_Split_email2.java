package HomeWork;

import java.util.Scanner;

public class HomeWork_108_Arrays_Split_email2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    String email = input.nextLine();
	    
	    if(!email.contains("@")) {
	    	System.out.println("invalid email");
	   }else {
	    
	    
	    String [] str = email.split("@");
	    System.out.println("Email id: "+ str[0]);
	    System.out.println("Email domain: "+ str[1]);
	    
	   }
	  }
	}	