package day11_logical_nestedif;

import java.util.Scanner;

public class HomeWork44 {
	public static void main(String[] args) {
		
	    Scanner s = new Scanner(System.in);
	    
	    
	    int house = s.nextInt();
	    int player = s.nextInt();
	    
	    
	    if (player>=21)System.out.println("bust");
	    if ((player < house) && (player<21)) System.out.println("player loss");
	    else if (house==player) System.out.println("its a tie");
	    else if (player>house && player<21) System.out.println("player wins");
 	  }
	}
