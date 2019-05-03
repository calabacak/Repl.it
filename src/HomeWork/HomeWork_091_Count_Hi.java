package HomeWork;

import java.util.Scanner;

public class HomeWork_091_Count_Hi {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		int count=0;
		
		for(int i=0; i<str.length()-1;i++) {
			
			if(str.substring(i,i+2).equals("hi")) {
				count+=1;
			}
		}System.out.println(count);
		

		
	}
	
	
	
	

}
