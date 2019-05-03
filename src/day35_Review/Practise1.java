package day35_Review;

public class Practise1 {
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

}
