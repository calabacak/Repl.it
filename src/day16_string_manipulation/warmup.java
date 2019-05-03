package day16_string_manipulation;

import java.util.Scanner;

public class warmup {
	public static void main(String[] args) {
		

		
		String sentence = " I love my wife, her name is Gul. We have 3 beautiful daughters.";
				
		System.out.println(" I love my wife, her name is Gul. We have 3 beautiful daughters.");	
		System.out.println(sentence.replace('a', 'B'));
		System.out.println(sentence.replace("love", "love very much "));
		int a = sentence.indexOf('.');
		System.out.println(sentence.substring(0, a+1));
		int b = sentence.length();
		if(sentence.contains("3")) {
			System.out.println("there is a number in this sentence");
			int indexnum = sentence.indexOf('3');
		System.out.println("index number is= "+ indexnum);

		}		
		int stringindexnum = Integer.parseInt(sentence.substring(42,43));
		System.out.println(stringindexnum);
		
		if(stringindexnum==3) {
			System.out.println("you will be go to heaven");
		}
	
	}

}
