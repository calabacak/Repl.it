package Most_Frequent_Coding_Questions;

import java.util.Arrays;

public class MF_01_Fibonacci_Series {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(getFibonacci(12)));

	}

	public static int[] getFibonacci(int nums) {

		int[] result = new int[nums];
	

		for (int i = 0; i < nums; i++) {
			if(i==0 || i==1) {
				result[i]=1;
				continue;
			}
			result[i] = result[i - 1] + result[i - 2];
		}
		return result;
	}
//https://javarevisited.blogspot.com/2017/07/top-50-java-programs-from-coding-Interviews.html
}
