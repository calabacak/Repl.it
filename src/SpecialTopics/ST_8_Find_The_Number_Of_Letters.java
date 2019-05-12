package SpecialTopics;

import java.util.*;

public class ST_8_Find_The_Number_Of_Letters {
	public static void main(String[] args) {

		String str1 = "cengiz alabacak";
		String str = str1.toLowerCase().replace(" ", "").trim();

		for (char i = 'a'; i <= 'z'; i++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str1.charAt(j) == i) {
					count++;
				}
			}
			if (count != 0) {
				System.out.println(i + "=" + count);

			}
		}
	}
}
