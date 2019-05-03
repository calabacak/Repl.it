package day18_whiledowhileloops;

import java.util.Scanner;

public class Whatsfordinner {
	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		int num = (int) (Math.random() * 4) + 1;
		
		System.out.println(num);
		switch(num) {
		case 1 : case 2:
			System.out.println("Pizza");break;
		
		case 3 :
			System.out.println("Bibimbap");break;
		
		case 4 :
			System.out.println("Bibimbap");break;
			
		}
		}

}
