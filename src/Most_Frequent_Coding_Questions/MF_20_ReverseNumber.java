package Most_Frequent_Coding_Questions;

public class MF_20_ReverseNumber {
	
	public static void main (String [] args) {
		
		System.out.println(findReverse(1234));
	}
	
	public static int findReverse(int num) {
		
		int reverse=0;
		int newnum=num;
		
		while(newnum>0) {
			int remainder= newnum%10;
			reverse= reverse*10+remainder;
			newnum=newnum/10;
		}
		
		return reverse;
		
	}

}
