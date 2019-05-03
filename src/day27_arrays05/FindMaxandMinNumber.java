package day27_arrays05;

public class FindMaxandMinNumber {
	public static void main(String[] args) {

		int[] nums = { 89, 69, 49, 109, 56 };

		int max = nums[0];
		int min = nums[0];

		for (int i = 0; i < nums.length-1; i++) {

			if (nums[i + 1] > max) {

				max = nums[i + 1];
			}else if(nums[i+1]<min) {
				min = nums[i+1];
			}

		}
		System.out.println("max number is "+max);
		System.out.println("min number is "+min);

	}

}
