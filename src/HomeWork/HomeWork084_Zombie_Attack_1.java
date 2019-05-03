package HomeWork;

import java.util.Scanner;

public class HomeWork084_Zombie_Attack_1 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int day = 0;
	    int inhabitants = scan.nextInt();
    	if(inhabitants>0) {
    		System.out.println("Day "+day+ " [" + inhabitants + "]");
    	}
	    while(inhabitants>0) {
	    	inhabitants = inhabitants/2;
	    	day = day +1;
	    	//if(inhabitants>0) {
	    		System.out.println("Day "+day+ " [" + inhabitants + "]");
	    //	}
	    }
	    
	    System.out.println("---- EXTINCT ----");
	  
	
	}

}
