package day23_Arrays;

public class ArrayReverseInteger {
	
	public static void main(String[] args) {
		
		int [] scores = {1,3,5,7,9,11};
		int [] scores2 = {11,33,51,71,91,111};
		
		int [ ] reversedScores = getReverseIntArray(scores);
		
		for(int score:reversedScores) {
			System.out.println(score);
			//System.out.println("============");
		}
	/////////////////////////////////////	
		int [ ] reversedScores2 =  getReverseIntArray2(scores2);
		for(int score2:reversedScores2) {
			System.out.print(score2+", ");
		}
		
		
////////////////////////////////////		
		
	}
	////////////////////////////
	public static int [] getReverseIntArray(int [] nums) {
		
		int [] reversedArray = new int [nums.length];
		
		for (int i=nums.length-1; i >= 0; i--) {
			
			reversedArray[nums.length-i-1]=nums[i];
			
		}return reversedArray;
	}
/////////////////////////////////////////
	public static int [] getReverseIntArray2(int [] nums) {
		
		int temp;
		for (int i = 0; i <= nums.length/2; i++) {
			temp = nums[nums.length-1-i];
			nums[nums.length-1-i]= nums[i];
			nums[i]=temp;
			
			
		
			
		}
		return nums;
		
	}
	
	
	
	
}
