package day36_Wrappers_Array_Lists;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {
	public static void main(String[] args) {
		
		
		ArrayList<String> names= new ArrayList<>();
		ArrayList<Integer> nums= new ArrayList<>();
		
		names.add("Roman");
		names.add("Orhan");
		names.add("Vlad");
		names.add("Olimjon");
		names.add("Natalia");
		
		nums.add(23);
		nums.add(34);
		nums.add(46);
		nums.add(98);
		nums.add(100);
		
		System.out.println(nums.get(3));
		
		//nums.remove(3);
		
		System.out.println(nums.get(3));
		

		
		
//		for(Integer s: nums) {
//			System.out.println(s);
//		}
//		for(String s: names) {
//			System.out.println(s);
//		}
			
		
	}

}
