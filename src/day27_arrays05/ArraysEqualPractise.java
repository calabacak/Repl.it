package day27_arrays05;

import java.util.Arrays;

public class ArraysEqualPractise {
	public static void main(String[] args) {

		int[] nums1 = { 34, 44, 54, 64, 74};

		System.out.println(nums1.length);
		int[] nums2 = { 34, 44, 54, 64, 74 };

		if (Arrays.equals(nums1, nums2)) {
			System.out.println("equal");
		} else
			System.out.println("not equal");
		
		
		String[] names1 = {"Ahmet", "Mehmet","Cengiz"};
		String[] names2 = {"Ahmet", "Mehmet","Cengiz"};
		
		if(Arrays.equals(names1, names2)) {
			
			System.out.println("same");
		}else System.out.println("NOT same");
		
		
		
		
		
		
		
		

		
		
	}

}
