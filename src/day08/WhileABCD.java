package day08;

import java.util.Scanner;

public class WhileABCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int result = 0;
		int not=0;
		
		
		while ( result == 0 ) {
			
			System.out.println("Please enter 40, 60, 80, or 100");
			not = scan.nextInt();
			
			
			
			if ( (not==60) || (not==80) || (not==100) || (not==40) ) {
				result = 1;
				System.out.println("Thank you");
				
				if (not == 40) {
					System.out.println("D aldin");
				}
				else if (not == 60) {
					System.out.println("C aldin");
				}
				
			} // if ( (not==60) || (not==80) || (not==100) || (not==40) )
				
			
			
			
			
		} //while ( result == 0 ) {
		
		
		
		

		 
		
	}

}
