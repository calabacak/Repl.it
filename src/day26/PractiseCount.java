package day26;

public class PractiseCount {
	public static void main(String[] args) {
		
	
//		int[] nums = {1,2,3,3,2,5,1};
//		
//		int count=0;
//		for(int i=0; i< nums.length;i++) {
//			count=0;
//			for(int j=0; j<nums.length; j++) {
//				if(nums[i]==nums[j]) {
//					count++;
//				}
//			} if(count==1) {
//				System.out.println(nums[i]);
//				return;
//			}
//		}
		
		
		// give me the prime numbers between 20 and 80;
		int count=0;
		for(int i= 20; i<=80; i++) {
			count=0;// this is very important cengiz dont forget to put this.
			for(int j=2; j<i; j++) {
				
				if(i%j==0) {
					count++;
				}
				
			} if(count==0) {
				System.out.println(i+ " is a prime number");
			} else {
				System.out.println(i+ " is NOT a prime number");
			}
			
			
		}
		
		
		
		
		
		
		
		
	}

}
