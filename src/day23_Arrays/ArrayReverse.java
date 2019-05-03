package day23_Arrays;

public class ArrayReverse {
	public static void main(String[] args) {
		
		String [] names1 = {"ali", "veli", "cengiz", "ozkan", "mehmet"};
		
		String [] reversedNames = getReverseString(names1);
		
		
		
	for(String name:reversedNames) {
		System.out.println(name);
		}
		
	}
	
	public static String [] getReverseString(String [] names) {
		
		String [] sortedNames = new String [names.length];
		
		for(int i = names.length-1; i>=0; i--) {
			
			sortedNames[names.length-i-1]= names[i];
		}
		return sortedNames;
		
	}

}
