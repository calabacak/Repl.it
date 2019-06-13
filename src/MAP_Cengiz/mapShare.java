package MAP_Cengiz;

import java.util.Map;

public class mapShare {
	/*
	 * // Make a new empty map
Map<String, String> map = new HashMap<String, String>();
map.get(key) -- retrieves the stored value for a key, or null if that key is not present in the map.

map.put(key, value) -- stores a new key/value pair in the map. Overwrites any existing value for that key.

map.containsKey(key) -- returns true if the key is in the map, false otherwise.

map.remove(key) -- removes the key/value pair for this key if present. Does nothing if the key is not present.
	 */

	
	
	
	
	public Map<String, String> mapShare(Map<String, String> map) {
		
		if(map.get("a")!=null) {
			map.put("b", map.get("a"));
		}
		map.remove("c");
		
		  
		return map;
	}
}
