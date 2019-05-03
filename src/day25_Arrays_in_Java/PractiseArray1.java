package day25_Arrays_in_Java;

import java.util.Arrays;

public class PractiseArray1 {
	public static void main(String[] args) {
		
		int [] population = new int[5];
		
		population[0]=500;
		population[1]=1500;
		population[2]=2500;
		population[3]=3500;
		population[4]=4500;
		
		for(int pop:population) {
			System.out.println(pop+"\t");
			
		}
		

		String str = Arrays.toString(population);
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		
	}

}
