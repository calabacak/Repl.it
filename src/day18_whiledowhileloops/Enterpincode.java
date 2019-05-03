package day18_whiledowhileloops;

import java.util.Scanner;

public class Enterpincode {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter pincode, you have 3 attemp");
		
		int pincode = scan.nextInt();
		
		int count =0;
		
		while(pincode!=4159 && count<3) {
			
			System.out.println("wrong enter pincode");
			pincode = scan.nextInt();
			count = count+1;
			
			if (count==3)
			System.out.println("your account has been blocked");
			return;
			
			}
		
		
		
		
		System.out.println("access granted");
	
	}

}
