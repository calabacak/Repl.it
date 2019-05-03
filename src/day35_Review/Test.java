package day35_Review;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		
		String alphabet =  "abcdefghijklmnopqrstuvwxyz";
		String encrypted = "zyxwvutsrqponmlkjihgfedcba";
		String sentence = "I will go";
		String word = "monday";
		char ch = 'y';
		
		
		//test1//
		
		System.out.println(Practise4.findUniqueChar(alphabet, encrypted, ch));
		
		//test2//
		
		System.out.println(Practise5.findUniqueString(alphabet, encrypted, word));
		//test3//
		
		System.out.println(Practise5.findUniqueSentence(alphabet, encrypted, sentence));
	}

}
