package day65_Collections02;
import java.util.*;

public class wordLen {
	
	/*
	 * 
Given an array of strings, return a Map<String, Integer> 
containing a key for every different string in the array, and the value is that string's length.
	 */
	
	public Map<String, Integer> wordLen(String[] strings) {
		
		Map <String, Integer> result = new HashMap<>();
		
		for(int i=0; i<strings.length; i++) {
			result.put(strings[i], strings[i].length());
		}
		
		return result;  
	}

}
