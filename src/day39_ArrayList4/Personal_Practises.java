package day39_ArrayList4;

import java.util.*;

public class Personal_Practises {
	public static void main(String[] args) {

		ArrayList<Integer> nums1 = new ArrayList<>();
		ArrayList<Integer> nums3 = new ArrayList<>();
		nums3.add(10);
		nums3.add(44);
		nums3.add(50);
		nums3.add(36);
		nums3.add(20);
		

		nums1.add(10);
		nums1.add(50);
		nums1.add(50);
		nums1.add(30);
		nums1.add(20);
		nums1.add(10);
		nums1.add(50);
		nums1.add(3);
		nums1.add(23);
		nums1.add(20);
		// System.out.println(findUnique(nums));

		System.out.println(nums1);
		ArrayList<Integer> nums2 = new ArrayList<>(nums1);
		//System.out.println(nums2);
		System.out.println(nums3);
		
//		if(nums2.equals(nums1)) {
//			System.out.println("equal");
//		}
//		
//		if(nums3.containsAll(nums1)) {
//			System.out.println("nums3 has everthing nums1 has");
//		}else {
//			System.out.println("something missing in nums3");
//		}
//		if(nums1.containsAll(nums3)) {
//			System.out.println("nums1 has everthing nums3 has");
//		}else {
//			System.out.println("something is missing in nums1");
//		}
		
		//nums1.removeAll(nums3);// how can we find the difference between nums3 and nums1;
//		nums1.retainAll(nums3);
//		System.out.println(nums1);
		
	
		nums3.removeAll(nums1);
		System.out.println(nums3);
		ArrayList <Integer> testing = new ArrayList<>(nums3);
		System.out.println(testing);
		
		nums3.addAll(nums1);
		System.out.println(nums3);
		System.out.println(testing);
		
//	System.out.println(nums3);
		
//		System.out.println(Collections.max(nums1));
//		System.out.println(Collections.min(nums2));

	}
	// find the unique values;

	public static ArrayList findUnique(ArrayList<Integer> list) {

		ArrayList<Integer> unique = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			int count = 0;
			for (int j = 0; j < list.size(); j++) {
				if (list.get(i) == list.get(j) && i != j) {
					count++;
					break;
				}
			}
			if (count == 0) {
				unique.add(list.get(i));
			}
		}
		return unique;
	}

}
