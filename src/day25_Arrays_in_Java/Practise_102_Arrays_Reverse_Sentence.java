package day25_Arrays_in_Java;

import java.util.Arrays;

public class Practise_102_Arrays_Reverse_Sentence {
	public static void main(String[] args) {
		
//		Given a String variable sentence, write code to type each word in separate lines in a reverse order.
//		Example:
//		sentence -> "Java is fun"
//		Print
//		fun
//		is
//		Java
		
		String str = "Java is fun cengiz ";	
		String [] strs = str.split(" ");
		
		String str2= Arrays.deepToString(strs);
		System.out.println(str2);
		
		System.out.println("=======================");
		
		for(int i= strs.length-1; i>=0; i--) {
			
			System.out.print(strs[i]+" ");
		}
		
		
	}

}
