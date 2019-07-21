package exam_06022019;

import java.util.Arrays;

public class LikeInInterview {
	
	public static void main(String[] args) {
		int [] arrs= {2,125,11,7,99,23,1,4};
		
		//System.out.println(Arrays.toString(arrs));
		//System.out.println(Arrays.toString(findTwoMax(arrs)));
		getTwoMaxValues(arrs);
		
		String input = "Try    to    remove   extra   spaces.";
		
		System.out.println(Arrays.toString(input.split(" ")));
		
		System.out.println(removeExtraSpaces(input));
		
		String str="Ali,,,,, is coming, home ,now";
		for(String s: str.split(",")) {
			System.out.println(s);
		}
		
		System.out.println("_______");
		String str2= "I   love       java";
		String [] strArr= str2.split(" ");
		System.out.println(strArr.length);//
		
		System.out.println(isPalindrome(12321));
		
	}
	
	public static int [] findTwoMax(int[] nums){

		int [] nums2= new int[2];

		int temp=0;
		for(int i=0; i<nums.length; i++){
			for(int j=i+1; j<nums.length; j++){
				if(nums[j]>nums[i]){
					temp=nums[j];
					nums[j]=nums[i];
					nums[i]=temp;
				}
			}
		}

	
	
	return nums;	
}
	
	public static void getTwoMaxValues(int [] nums) {
		
		int max1=nums[0];
		int max2=max1-1;
		int temp=0;
		
		for(int i=0; i<nums.length; i++) {
			
			if(nums[i]>max2 && nums[i]>max1) {
				max1= nums[i];	
			}else if(nums[i]>max2){
				max2= nums[i];
			}
			
		}
				
		System.out.println(max1+" | "+max2);
	}
	
	/*
	Question-7: Write Java Code To Get Rid Of Multiple Spaces From A String?
	 */
	
	public static String removeExtraSpaces(String str) {

		String [] strArr= str.split(" ");
		for(String s: strArr){
			System.out.println(s);
		}
		System.out.println(strArr.length);
			String result="";
			for(int i=0; i< strArr.length; i++) {
				if(!strArr[i].equals("")){
					result+=strArr[i]+" ";
					System.out.println(result);
				}
				
			}
			
			
			System.out.println(result.trim().length());
			return result.trim();
		}
	public static boolean isPalindrome(int num){
		
		int a=num;
		int reversedNum=0;
		int remainder=0;
		while(a>0){
			remainder=a%10;
			reversedNum=remainder+reversedNum*10;
			a=a/10;
		}

		if(reversedNum==num){
		return true;
		}
		return false;

	}
	
}
	
	
	
	
	

