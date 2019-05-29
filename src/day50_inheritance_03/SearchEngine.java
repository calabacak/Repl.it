package day50_inheritance_03;

public class SearchEngine {
	public int search(String item) {
		System.out.println("Searching for: " + item);
		int resultsCount = item.length();
		return resultsCount;
	}

	protected int search(String item, String item2) {
		System.out.println("Searching for 2 items: " + item + " , " + item2);
		int resultsCount = item.length() + item2.length();
		return resultsCount;
	}
	
	 String clickResult() {
		System.out.println("Clicking result");
		return "Search result page";
	}

}
