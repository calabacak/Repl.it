package day65_Collections02;

import java.util.Map;

public class mapShare {

	public static void main(String[] args) {

	}

	public Map<String, String> mapShare(Map<String, String> map) {
		if (map.containsKey("a")) {
			if (!map.get("a").isEmpty()) {
				map.put("b", map.get("a"));
			}
		}
		map.remove("c");
		return map;
	}
}
