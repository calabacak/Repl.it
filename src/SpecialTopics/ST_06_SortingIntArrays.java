package SpecialTopics;

public class ST_06_SortingIntArrays {
	public static void main(String[] args) {

		int[] myArray = { 7, 4, 9, 2, 5, 1, 99, 56, 137, 32 };
		String [] names = {"cengiz", "ali", "burak","zeynep","ceyda","ceren","ahmet"};

		getSortedArrayMintoMax(myArray);
		for (int num : myArray) {
			System.out.print(num + ", ");
		}
		System.out.print("Min value is = " + myArray[0] + "\t");
		System.out.println("Max value is = " + myArray[myArray.length - 1]);
		System.out.println();
		getSortedArrayMaxToMin(myArray);
		for (int num : myArray) {
			System.out.print(num + ", ");
			
			
			////////////////
			
			getSortedArrayAlphabetically(names);
			
			for(String name:names) {
				System.out.println(name);
			}
			
			
			
			
			
		}

	}
//////////////////////////////////////////////////////////////////
	public static int[] getSortedArrayMintoMax(int[] nums) {
		int temp;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] < nums[i]) {
					temp = nums[j];// be careful keep in mind the diagonal development
					nums[j] = nums[i];
					nums[i] = temp;
				}

			}

		}
		return nums;
	}

	public static int[] getSortedArrayMaxToMin(int[] nums) {
		int temp;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] > nums[i]) {
					temp = nums[j];// be careful keep in mind the diagonal development
					nums[j] = nums[i];
					nums[i] = temp;
				}

			}

		}
		return nums;
	}
	
	public static String[] getSortedArrayAlphabetically(String[] names) {
		String temp;
		
		for(int i =0; i<names.length-1;i++) {
			
			if(			(names[i+1].compareTo(names[i])>0)) {
				temp= names[i+1];
				names[i+1]=names[i];
				names[i]=temp;
			}
			
			
		}return names;
		
	}
	
	
}
