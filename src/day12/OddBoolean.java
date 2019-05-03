package day12;

import java.util.Scanner;

public class OddBoolean {
	public static void main(String[] args) {
		
		int startnum, endnum;
		int sum = 0;
		int count = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter starting number");
		startnum = scan.nextInt();
		
		System.out.println("enter ending number");
		endnum = scan.nextInt();
		
		if (startnum<=0 || endnum<=0 || endnum<startnum) {
			System.out.println("invalid input");
		}else 
			for(int i=startnum; i<=endnum; i++) {
				if(i%2==1) {
					count = count +1;
					sum = sum +i;
					System.out.println("found value"+ i);
				}
			}
			System.out.println(sum + "   " + count);
		
	}
	
}
