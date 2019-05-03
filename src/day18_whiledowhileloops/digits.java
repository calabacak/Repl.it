package day18_whiledowhileloops;

public class digits {
	public static void main(String[] args) {
		
		int number = 3456123;
		int i = 0;
		while(number>0) {
			int digit = number%10;
			number = number/10;
			i=i+1;
			System.out.println(digit+" is the " + i+ "th digit from the right hand side ");
		}
		
		
	}

}
