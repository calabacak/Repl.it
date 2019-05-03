package day26;

import java.util.Arrays;

public class PractiseMentoring {
	public static void main(String[] args) {
		
		String [] sentence;
		sentence= new String[5];
		//String words[]= new String[] {"apple","orange","grapes","lemon"};
		String words[]= new String[4];
		
	System.out.println(words[0]);
		
		/////////////split///////////////
				
		String str= "I was going home when I saw her";
		
		String arrstr[]= str.split(" ");
		
		System.out.println(Arrays.toString(arrstr));

		System.out.println(arrstr[0]);
		System.out.println(arrstr[2].length());
		
/////////////to char
		
		char [] charstr= str.toCharArray();
		System.out.println(Arrays.toString(charstr));
		
////////////////////int arrays///////////////////////////
		
		int [] nums = {4, 3, 2, 44, 1, 100, 55};
		
		System.out.println(nums.length);
		//System.out.println(nums[4].length()); int values do not have a length
		
		
		////////////assignment 119/////////////////////
		
		int sum=0;
		for(int i=0; i<nums.length; i++) {
			
			sum= sum+nums[i];
		}
		
		System.out.println("average is = "+sum/nums.length);
		
		
		
////////////assignment 118/////////////////////
		
		System.out.println("========before========");
		
		System.out.println(Arrays.toString(nums));
		int temp=0;
		for (int i=0; i<nums.length/2; i++) {
			temp= nums[i];
			nums[i]= nums[nums.length-1-i];
			nums[nums.length-1-i]=temp;
		}
		System.out.println("========after========");
		System.out.println(Arrays.toString(nums));
		
		
		
		
		
	}

}
