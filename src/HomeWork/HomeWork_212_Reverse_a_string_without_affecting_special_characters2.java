package HomeWork;

import java.util.*;

import java.util.Arrays;

public class HomeWork_212_Reverse_a_string_without_affecting_special_characters2 {
	public static void main(String[] args) {

		String word = "%..zxcv..dqw";
		char[] ch = word.toCharArray();
		char[] nch = new char[ch.length];

		ArrayList<Character> list1 = new ArrayList<>();
		ArrayList<Character> list2 = new ArrayList<>();

		for (char c : ch) {
			list1.add(c);
		}

		System.out.println(list1);

		for (int i = list1.size() - 1; i >= 0; i--) {
			if (Character.isLetter(list1.get(i))) {
				list2.add(list1.get(i));
			}
		}
		System.out.println(list2);
		
		for(int i=0; i<list1.size();i++) {
			if (!Character.isLetter(list1.get(i))) {
				list2.add(i,list1.get(i));
			}
		}
		System.out.println(list1);
		System.out.println(list2);
		
		word="";
		
		for(Character c:list2) {
			word+=c;
		}
		System.out.println(word);
		
	}

}
