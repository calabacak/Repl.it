package day34_methods6;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
	
	public static int [] getRandomArray(int size) {
		
		Random random= new Random();
		int [] arr= new int[size];
		
		for(int i=0; i<size; i++) {
			arr[i]= random.nextInt(101);
		}
		
		return arr;
		
		
	}
	public static void main(String[] args) {
		
		Random random= new Random();
		
		System.out.println(Arrays.toString(getRandomArray(random.nextInt(5))));
		
	}

}
