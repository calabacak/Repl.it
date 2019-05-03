package SpecialTopics;

import java.util.Arrays;

public class ST_20_SortingStringArray {
	/*
	 * let us try to write the code binary search method by our self
	 */
	public static void main(String[] args) {

		String[] str = { "cengiz", "ali", "ceyda", "duru", "gul", "ahmet" };
		// Arrays.sort(str);
		// System.out.println(Arrays.toString(str));

		String temp = "";
		for (int i = 0; i < str.length; i++) {// we need two loops cengiz
			for (int j = 0; j < str.length; j++) {

				if (str[i].compareTo(str[j]) < 0) {
					temp = str[j];
					str[j] = str[i];
					str[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(str));
	}
	// number comes first, capital letter comes next and lastly the lower case cames
// https://codescracker.com/java/program/java-program-sort-string.htm
}
