package SpecialTopics;

public class ST_24_FindUniqueNumbers {
	public static void main(String[] args) {
		int[] nums = { 7, 4, 1, 4, 1, 5, 9, 9, 3 };

		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(nums[i]);
			}

		}
	}
	
	public static int[] findUniqueNums(int[] arr) {
		int size = 0;
		int[] newarr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int count = 0;

			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1) {
				newarr[i] = arr[i];
				size++;
			}
		}
		int[] result = new int[size];
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1) {
				result[k] = arr[i];
				k++;
			}
		}
		return result;
	}
	
////////
	private static void findUnique(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(nums[i]);
			}

		}
	}
///////////	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
