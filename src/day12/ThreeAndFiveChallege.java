package day12;

public class ThreeAndFiveChallege {
	
	public static void main(String[] args) {
		
		int i;
		int sum = 0;
		int count = 0;
		
		for (i=1; i<=1000; i++) {
			if(i%3==0 && i%5==00) {
				sum=sum + i;
				count = count +1;
				System.out.println(i);
			}if (count==5) {
					break;
				}
				
			
			
		}
		System.out.println(sum);
	}

}
