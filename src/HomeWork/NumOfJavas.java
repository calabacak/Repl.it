package HomeWork;

import java.util.Scanner;

public class NumOfJavas {
	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
	    String word = scan.next();
		
		//String str1 = "xjavaapplejavapearjavaegg";
		String str2 = "java";
		
		
		
		
		int count=0;
		for(int i = 0; i<word.length()-str2.length()+1; i++) {
			if(	word.substring(i, i+str2.length()).equals(str2)){
				count+=1;
			}
		}System.out.println(count);
	}

}

//xjavaapplejavapearjavaeggjavajava 
//-str2.length()