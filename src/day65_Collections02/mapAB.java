package day65_Collections02;

import java.util.Map;

public class mapAB {
	/*
	 * Modify and return the given map as follows: 
	 * for this problem the map may or may not contain the "a" and "b" keys. 
	 * If both keys are present, 
	 * append their 2 string values together and store the result under the key "ab".
	 * mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
	 */

	
	public Map<String, String> mapAB(Map<String, String> map) {
		
		if(map.containsKey("a")&& map.containsKey("b")) {
			map.put("ab", map.get("a")+map.get("b"));
		}
		return map;
		  
	}
}
