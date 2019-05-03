package day24;

public class Find100existornot {
	public static void main(String[] args) {
		
		
		int [] arr = {3,5,78,345,23,34,56};
		
		int count=0;
		
		for(int i=0; i<arr.length; i++) {
		
			if(arr[i]==100) {
				System.out.println("100 is found at "+ i);
				count++;
			}
		} if(count==0) {
			System.out.println("100 is not found");
			
		}
		
		
	}

}
