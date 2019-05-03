package day09;

import java.util.Scanner;

public class Languages {
	public static void main(String[] args) {
		int option;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter option from 1 to 4");
		
		option = scan.nextInt();
		if (option==1)
			System.out.println("hello");
		if (option==2)
			System.out.println("Hola");
		if (option==3)
			System.out.println("Bonjoi");
		if (option==4)
			System.out.println("Merhaba");

	}

}
