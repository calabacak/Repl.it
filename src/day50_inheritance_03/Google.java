package day50_inheritance_03;

public class Google extends SearchEngine{
	
	@Override
	public int search(String item) {
		System.out.println("Google Searching for: " + item);
		int resultsCount = item.length();
		return resultsCount;
	}
	
	//protected
	public int search(String item, String item2) {
		System.out.println("Google Searching for 2 items: " + item + " , " + item2);
		int resultsCount = item.length() + item2.length();
		return resultsCount;
	}
	
	//protected, default
	public	String clickResult() {
		System.out.println("Clicking result");
		return "Search result page";
	}

}
