package SpecialTopics;

public class ST_07_ReverseArray {
	public static void main(String[] args) {

		int[] myArray = { 7, 4, 9, 2, 5, 1, 99 };
		String[] myNames = {"Cengiz", "Ali", "Veli", "Mehmet","Gul"};
		getReversedArray2(myNames);
		for(String name :myNames) {
			System.out.print(name+" ");
		}

		getReversedArray(myArray);

		for (int num : myArray) {
			System.out.print(num + " ");
		}
	}

	public static int[] getReversedArray(int[] nums) {

		int temp;

		for (int i = 0; i < nums.length / 2; i++) { // dont forget to divide by two;
			temp = nums[i];
			nums[i] = nums[nums.length - 1 - i];
			nums[nums.length - 1 - i] = temp;
		}
		return nums;
	}
	
	public static String[] getReversedArray2(String[] names) {

		String temp;

		for (int i = 0; i < names.length / 2; i++) { // dont forget to divide by two;
			temp = names[i];
			names[i] = names[names.length - 1 - i];
			names[names.length - 1 - i] = temp;
		}
		return names;
	}
	
	
	
	
	
	
	
	
}
