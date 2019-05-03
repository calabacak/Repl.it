package HomeWork;

import java.util.Scanner;

public class GreenTicket {
	public static void main(String[] args) {
		;
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		
		//////////////////////////////
		
		if(a==b && a==c && a==d) {
			System.out.println(30);
		}
		//////////////////////////////////
		else if(a==b && a==c) {
			System.out.println(20);
		}else if(a==b && b==d) {
			System.out.println(20);
		}else if(b==c && c==d) {
			System.out.println(20); 
		}else if(a==c && c==d) {
			System.out.println(20); 
		}
		
		////////////////////////////////////////////////
		
		else if (a==b ) {
			System.out.println(10);
		}else if (a==c) {
			System.out.println(10);
		}else if (a==d) {
			System.out.println(10);
		}else if (b==c) {
			System.out.println(10);
		}else if (b==d) {
			System.out.println(10);
		}else if (c==d) {
			System.out.println(10);
		}
		
////////////////////////////////////////////////
		else if(a!=b && a!=c && a!=d) {
			System.out.println(0);
		}
		
	}

}
