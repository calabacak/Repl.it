package HomeWork;

public class HomeWork_176_MethodOverloading {
	public static void main(String[] args) {
		
		int [] nums = {6,2,9,11,67,23};
		int [] dnums = {61,21,91,111,671,231};
		
//		System.out.println(findMax(nums));
//		System.out.println(findMax(dnums));
		
	}
	
	
	public  int findMax(int [] arr) {
		int max= arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]> max) {
				max=arr[i];
			}
			
		}
		return max;
	}

	public  double findMax(double [] arr) {
		double max= arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]> max) {
				max=arr[i];
			}
			
		}
		return max;
	}
	
	
	
	
}
