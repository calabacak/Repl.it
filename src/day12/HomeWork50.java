package day12;

import java.util.Scanner;

public class HomeWork50 {
	public static void main(String[] args) {
		   //DO NOT CHANGE
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter command:");
	    char response = scan.next().charAt(0);
	    //WRITE YOUR CODE HERE 
	    switch(response){
	    	
	    case 'y':
	    	System.out.println("Your request is being processed");break;
	    case 'n':
	    	System.out.println("Thank you anyway for your consideration is printed");break;
	    case 'h':
	    	System.out.println("Sorry, no help is currently available is printed");break;
	    default : System.out.println("nvalid entry, please try again!");
	    	
	    	
	    	
	    	
	    }
			
	  }
	}
