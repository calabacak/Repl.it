package day34_methods6;

public class CountArray {
	public static int findOccurences(int [] array, int value) {
		
		int count=0;
		for(int i=0; i< array.length; i++) {
			if(array[i]==value) {
				count++;
			}
		}
		return count;
	}

}
