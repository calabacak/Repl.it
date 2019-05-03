package day21;

import java.util.Scanner;

public class Practise2 {
	public static void main(String[] args) {
		
		String str = "wooden space";
		String newStr="";
				for(int i =0; i<str.length(); i++) { 
					if(!newStr.contains(""+	str.charAt(i))) {
						newStr=newStr+str.charAt(i);
					}	
				}System.out.println(newStr);
		
	}

}
