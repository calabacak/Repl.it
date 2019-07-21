package day65_Collections02;

import java.util.*;

public class pairs {

	/*
	 * Given an array of non-empty strings, create and return a Map<String, String>
	 * as follows: for each string add its first character as a key with its last
	 * character as the value.
	 */

	public Map<String, String> pairs(String[] strings) {
		Map<String, String> result = new HashMap<>();

		for (int i = 0; i < strings.length; i++) {
			result.put(strings[i].charAt(0) + "", strings[i].charAt(strings[i].length() - 1) + "");
		}
		return result;
	}

}
