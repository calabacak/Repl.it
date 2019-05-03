package day37_ArrayList;

import java.util.*;

public class RemoveInteger {
	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		System.out.println(nums.size());
		
		nums.add(4);
		nums.add(14);
		nums.add(24);
		nums.add(34);
		nums.add(44);
		nums.add(54);
		
		System.out.println(nums.toString());
		
		Integer n1= new Integer (14);
		Integer n2=  Integer.valueOf(14);
		
		nums.remove(n1);
		System.out.println(nums.toString());
		
		
		List<Double> prices = Arrays.asList(34.90,67.90,99.90,111.99,211.99,213.99);
		double sum=0;
		for(double price:prices) {
			sum+=price;
		}
		
		List<Double> expensive= new ArrayList<>();
		
		for(double price:prices) {
			if(price>100) {
				expensive.add(price);
			}
		}
		System.out.println(expensive.toString());
		
		//prices.removeAll(expensive);
		
		//System.out.println(prices.toString());

	}

}
