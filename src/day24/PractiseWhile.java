package day24;

import java.util.Scanner;

public class PractiseWhile {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		String numList = "";
		int i = 0;

		while (i <= num) {

			if (i % 2 == 1) {
				if (num - i <= 1) {
					numList += i ;
				} else
					numList += i + ", ";
			}
			i++;
		}
		System.out.println(numList);
		
		/////////////////////////////
		
		int number=scan.nextInt();
		String numevenList="";
		for(i=1; i<=number;i++) {
			if(i%2==0) {
				if(number-i<=1) {
					numevenList+=i;
				}else numevenList+=i+", ";
			}

		}System.out.println(numevenList);
		
	
		
	}
}
