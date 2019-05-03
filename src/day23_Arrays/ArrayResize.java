package day23_Arrays;

public class ArrayResize {
	public static void main(String[] args) {
		
		int [] nums = {3,1,5,2,7};
		int [] temp = new int[nums.length];
		
		for (int i = 0; i < temp.length; i++) {
			
			temp[i]=nums[i];
			
		}
		nums = new int [10];
		for (int i = 0; i < temp.length; i++) {
			nums[i]=temp[i];
			
		}for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
			
			
		}
	}

}
