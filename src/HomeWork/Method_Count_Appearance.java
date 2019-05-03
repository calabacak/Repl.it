package HomeWork;

public class Method_Count_Appearance {
	public static void main(String[] args) {
		
		String [] arr= {"aaa", "bbb", "aaa", "ccc","ddd","aaa","bbb"};
		System.out.println(countAppearance(arr,"aaa"));;
		
		
	}
	
	
	
	public static int countAppearance(String [] arr, String str) {
		
		int count=0;
		
		for(int i= 0; i<arr.length; i++) {
			if(arr[i].contentEquals(str)) {
				count++;
			}
		}return count;
	}
}
