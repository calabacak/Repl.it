package day31_methods3;

public class GoogleSearch {
	
	public static void googleSearchResult(String str) {
		
		//str="About 16,600,000 results (0.73 seconds)";
		String [] arr= str.split(" ");
//		   "Results count: 121000000"
//		   "Time in seconds: 0.75"
		
		System.out.println("Results count: "+arr[1].replace(",", ""));
		System.out.println("Time in seconds: "+arr[3].substring(1));
	}
	
	public static void main(String[] args) {
		googleSearchResult("About 16,600,000 results (0.73 seconds)");
		
	}

}

