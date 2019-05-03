package day11_logical_nestedif;

import java.util.Scanner;

public class LoginTests {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your username :");
		
		String validUserName = "calabacak@gmail.com";
		String validPassword = "WoodenSpoon123";
		
		String userName, password;
		
		userName = scan.nextLine();
		System.out.println("Please enter your password :");
		password = scan.nextLine();
		
		if (	userName.equalsIgnoreCase(validUserName)	&&	password.contentEquals(validPassword)){
			
			System.out.println("Login Successful, Welcome!");
		}
		else if (	!userName.equals(validUserName)	&&	password.contentEquals(validPassword)){
			
			System.out.println("Invalid Username");
		}
		else if (	userName.equalsIgnoreCase(validUserName)	&&	!password.contentEquals(validPassword)){
			
			System.out.println("Invalid Password");
		}
		else if (	!userName.equals(validUserName)	&&	!password.contentEquals(validPassword)){
			
			System.out.println("Invalid Username and Invalid Password");
		}
				
	}

}
