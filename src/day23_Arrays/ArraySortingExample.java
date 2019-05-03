package day23_Arrays;

public class ArraySortingExample {
	
	public static void main(String[] args) {
		
		int [] nums = {52,2,4,6,12,1};
		int [] sorted = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			sorted[i]=nums[i];
		}
				
		int temp;
		
		for (int i = 0; i < sorted.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(sorted[j]>sorted[i]) {
					temp=sorted[j];
					sorted[j]=sorted[i];
					sorted[i]=temp;
				}
				
			}
			
		}
		for (int i = 0; i < sorted.length; i++) {
			System.out.print(sorted[i]+", ");
			
		}
	}

}
