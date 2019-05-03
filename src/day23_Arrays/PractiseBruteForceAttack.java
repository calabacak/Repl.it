package day23_Arrays;

import java.util.Scanner;

public class PractiseBruteForceAttack {
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		String ExpectedUsername = "calabacak";
		String ExpectedPassword = "password1234";
		int attempt=0;
		
		do {
			System.out.println("enter your password and username");
			
			String inputUsername= scan.next();
			String inputPassword= scan.next();
			
			if(!inputUsername.contentEquals("ExpectedUsername") || !inputPassword.contentEquals("ExpectedPassword")){
				attempt++;
			}
					
			if(attempt>=2) {System.out.println("goodbye");break;
				
			} 
				
		}while(attempt<=2);
		
	}

}
