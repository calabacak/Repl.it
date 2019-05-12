package day40_customclasses_methods;

import java.util.*;

public class WarmUpList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("cengiz");
		list.add("cengiz");
		list.add("cengiz");
		list.add("ali");

		String word = "cengiz";
		System.out.println(countOccurances(list, word));

	}

	public static int countOccurances(ArrayList<String> list, String word) {

		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).contentEquals(word)) {
				count++;
			}
		}
		return count;

	}

}
