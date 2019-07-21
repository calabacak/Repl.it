package day65_Collections02;

import java.util.*;

public class word0 {
	/*
	 * Given an array of strings, return a Map<String, Integer> containing a key for
	 * every different string in the array, always with the value 0. For example the
	 * string "hello" makes the pair "hello":0. We'll do more complicated counting
	 * later, but for this problem the value is simply 0.
	 */

	public Map<String, Integer> word0(String[] strings) {

		Map<String, Integer> result = new HashMap<>();

		for (int i = 0; i < strings.length; i++) {
			result.put(strings[i], 0);
		}
		return result;
	}

}
