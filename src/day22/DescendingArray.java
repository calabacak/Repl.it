package day22;

public class DescendingArray {
	public static void main(String[] args) {
		
		int [] nums= {5,2,8,3,7,1,9};
		
		
		
		int [] sortedNums= sortArray(nums);
		
		
		for (int i = 0; i < sortedNums.length; i++) {
			
			System.out.println(sortedNums[i]);
		}
			
		
	}
	
	public static int[] sortArray(int[] sorted) {
		int temp;
		for (int i = 0; i < sorted.length; i++) {
			for (int j = i+1; j < sorted.length; j++) {
				if(sorted[j]>sorted[i]) {// descending or ascending < or >
					temp=sorted[i];
					sorted[i]=sorted[j];
					sorted[j]=temp;
				}
				
				
				
			}
			
		}return sorted;
		
		
		
	}
	
	
	

}
