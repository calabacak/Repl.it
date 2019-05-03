package day23_Arrays;

public class ArrayReverse2 {
	
	public static void main(String[] args) {
		
		

		String [] names = {"ali", "veli", "cengiz", "ozkan", "mehmet", "aykut", "alp"};
		String [] reversedNames = new String [names.length];
		for(int i = names.length-1; i>=0; i--) {
			
			reversedNames[names.length-i-1]= names[i];
		}
		for(String name:reversedNames) {
			System.out.println(name);
		}
		
	}
		
		
	}


