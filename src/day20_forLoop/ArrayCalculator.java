package day20_forLoop;

public class ArrayCalculator {
	public static void main(String[] args) {
		
		int[]array = {1,2,67,35,65,99,22,78};
		
		calculate(array);
		
	}
	
	private static void calculate(int[]array) {
	int l = array.length;
	int i = 0;
	int j = 1;
	
	for(i=0;i<=l-1;i++) {
		for(j=i+1;j<=l-1;j++) {
			if(array[i]+array[j]==100) {
				System.out.println(array[i]+"-"+array[j]);
			}
		}
		
		
		
	}

}
}