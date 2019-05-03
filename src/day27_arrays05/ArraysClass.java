package day27_arrays05;

import java.util.Arrays;

public class ArraysClass {
	public static void main(String[] args) {
		
		int[] nums = {43,12,4,1,3,5};
		
		//toString method
		
		System.out.println(Arrays.toString(nums));
		
		String str= Arrays.toString(nums);
		
		System.out.println(str);
		
		Arrays.sort(nums);
		
		System.out.println(Arrays.toString(nums));
        String[] languages = {"Zulu", "Spanish", "Italian", "English","english", "Polish", "Arabic","Uzbek"};
        Arrays.sort(languages);
        
       
        System.out.println(Arrays.toString(languages));
        
        
        int [] nums3 = {99,4,10,20, 5,50};
        
        Arrays.sort(nums3);
   
        int pos = Arrays.binarySearch(nums3, 10);
        
        System.out.println(pos);
        
        
        int [] nums4 = {99,4,10,20,5,50};
        int pos4 = Arrays.binarySearch(nums4, 99);
        System.out.println(pos4);
        
        
        
        
        
        
        
        
	}
	
	

}
