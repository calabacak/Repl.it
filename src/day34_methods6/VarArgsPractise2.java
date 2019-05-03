package day34_methods6;

public class VarArgsPractise2 {
	public static void main(String[] args) {
		
		printWords("red", "blue");
		printWords("red", "blue", "white");
		
	}
	
	
	
	public static void printWords(String...words) {
		//handle it lie an ARRAY
		for(String w:words) {
			System.out.println(w);
		}
	}

}
