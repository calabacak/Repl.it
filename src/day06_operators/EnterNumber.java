package day06_operators;

import java.util.Scanner;

public class EnterNumber {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the password name and age second");
		
		//String password = scan.next();
		String name = scan.next();
		int age = scan.nextInt();
		
		 if (age > 50 && name.equals("cengiz")) {
			
			System.out.println("hey "+name+" you are "+age+" and you are too old");
		}
		
		
		else {
		System.out.println("hey"+name+" you are"+age+" and you are still young");
		}	
	}

}
