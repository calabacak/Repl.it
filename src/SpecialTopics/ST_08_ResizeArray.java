package SpecialTopics;

public class ST_08_ResizeArray {
	public static void main(String[] args) {
		
		int[] myArray = { 7, 4, 9, 2, 5, 1, 99, 56, 137, 32 };
		//System.out.println(myArray.length);
		int[] temp= new int[myArray.length];
		
		for (int i = 0; i < myArray.length; i++) {
			
			temp[i]= myArray[i];
			
		}
		for(int num:temp) {
			System.out.println(num);
		}
		myArray = new int[14];
		for(int i =0; i<temp.length; i++) {
			myArray[i]= temp[i];
			
		}
		
		
		for(int a : myArray) {
			System.out.println(a);
		}
	}

}
