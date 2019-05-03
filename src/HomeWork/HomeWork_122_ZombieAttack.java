package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork_122_ZombieAttack {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    int[] inhabitants = new int[8];
	    for(int i=0; i<inhabitants.length; i++) {
	      inhabitants[i] = input.nextInt();
	    }
	    
	    //TODO. Write you code below this line. 
	    int count=0;
	    
	    
	    do {
	    count=0;
	    int k=0;
	    for (int i = 0; i < inhabitants.length; i++) {
			if(inhabitants[i]==0) {
				count++;
			}else inhabitants[i]=inhabitants[i]/2;
		} 
	    	System.out.println("Day "+(k)+Arrays.toString(inhabitants));
	    	k++;
	    }while(count!=inhabitants.length);
			System.out.println("Day "+("10")+Arrays.toString(inhabitants));    
	  }
	}
		
		
		
