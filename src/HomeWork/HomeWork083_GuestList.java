package HomeWork;

import java.util.Scanner;

public class HomeWork083_GuestList {
	public static void main(String[] args) {
		
		String list="";
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter guest name:");
		String name1 = input.next();
		System.out.println("Do you want to enter new guest name:");
		String answer = input.next();
		if(answer.contentEquals("no")) {
			System.out.println("Guest's list: "+ name1);
		}
		else {
		while(answer.contentEquals("yes")) {
			System.out.println("Please enter guest name:");
			 String name = input.next();
			 list = list + ", " + name; // result is = ",  name2, name3, name4, name5"
			System.out.println("Do you want to enter new guest name:");
			answer = input.next();
		}
		System.out.println("Guest's list: "+name1+list);
		}
	}

}
