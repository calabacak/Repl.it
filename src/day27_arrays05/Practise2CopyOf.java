package day27_arrays05;

import java.util.Arrays;

public class Practise2CopyOf {
	public static void main(String[] args) {
		
		int [] nums1= {34,56,23,1,55};
		
		int [] nums2 = Arrays.copyOf(nums1, nums1.length+2);
		
		System.out.println(Arrays.toString(nums1));
		
		System.out.println(Arrays.toString(nums2));
		
		int [] nums3= Arrays.copyOfRange(nums1, 2, 4);
		System.out.println(Arrays.toString(nums3));
		
		int [] brandNew= {34,23,54,23};
		
		brandNew= Arrays.copyOf(brandNew, brandNew.length+3);
		System.out.println(Arrays.toString(brandNew));
		
		
		
	}

}
