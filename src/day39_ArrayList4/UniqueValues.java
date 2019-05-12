package day39_ArrayList4;

import java.util.*;

public class UniqueValues {
	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<>();
		List<Integer> unique = new ArrayList<>();

		nums.add(10);
		nums.add(10);
		nums.add(7);
		nums.add(8);
		nums.add(8);
		nums.add(3);
		nums.add(4);
		nums.add(8);
		System.out.println(nums);
		System.out.println(nums);

		///// first create a unique arraylist
		List<Integer> unique2 = new ArrayList<>();

		for (Integer num : nums) {
			if (!unique2.contains(num)) {
				unique2.add(num);
			}
		}
		System.out.println(unique2);

		///////// find unique values
		for (int i = 0; i < nums.size(); i++) {
			int count = 0;
			for (int j = 0; j < nums.size(); j++) {
				if (nums.get(i) == nums.get(j)) {
					count++;
				}
			}
			if (count == 1) {
				unique.add(nums.get(i));
			}
		}
		System.out.println(unique);
	}
}
