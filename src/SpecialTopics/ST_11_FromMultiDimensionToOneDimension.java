package SpecialTopics;

public class ST_11_FromMultiDimensionToOneDimension {
	
	public static void main(String[] args) {
		//2-Dimensional int array object
		int [][] arr = {
				{9, 76, 17, 39}, 
				{8, 87}, 
				{16, 99, 231}, 
				{187}
		};
		
		//Logic to find out total number of elements in above array.
		//I am adding elements in each row to find out total elements.
		int noOfElements = 0;
		for(int i = 0; i < arr.length; i++) {
			noOfElements += arr[i].length;
		}
		
		System.out.println("Length of 1-Dimensional array: " + noOfElements);
		
		//Create One-Dimensional int array with length equals to noOfElements value
		int [] oneDimArr = new int[noOfElements];
		int k = 0; //index for oneDimArr
		
		//Nested for loop to get all Two-dimensional array elements one by one
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				oneDimArr[k] = arr[i][j]; //Assign 2-D array element to 1-D array
				k++; //increment k by 1
			}
		}
		
		//Print 1-Dimensional array
		for(int i = 0; i < oneDimArr.length; i++) {
			System.out.print(oneDimArr[i] + "  ");
		}
	
	}
}
