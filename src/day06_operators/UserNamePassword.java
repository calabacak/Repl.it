package day06_operators;

import java.util.Scanner;

public class UserNamePassword {

	public static void main(String[] args) {
		int i;
		
		for(i=1; i<=3; i++) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please enter your user name and"+
							" your password");

		String user_name = keyboard.next();
		String password = keyboard.next();
		
		if (user_name.equals("calabacak") && password.equals("naples")) {

			System.out.println("congratulations");
			return;
		} else
			System.out.println("user name or password incorrect. You tried "+i+ " times. You can try "+ (3-i)+ " more times" );
		
		}	
		System.out.println("Your account has been locked. Please see your admin!" );
	}

}
