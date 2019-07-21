package day65_Collections02;
import java.util.*;

public class LoopWithIterator {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(50);nums.add(543);nums.add(1150);nums.add(550);nums.add(570);
		nums.add(90);nums.add(5330);nums.add(1150);nums.add(50666);nums.add(950);
		
		//1) Create Iterator object
		Iterator<Integer> it = nums.iterator();
		
		//2) Call hasNext, next methods
		/*
		 * hasNext return true, if there is still next value
		 * returns false when it reaches the end or empty
		 * 
		 * next() method returns the current value and moves to next value
		 */
		System.out.println("it.hasNext() -> " + it.hasNext());
		System.out.println("it.next() -> " + it.next());
		System.out.println("it.next() -> " + it.next());
		
		//3) use a while loop
		while(it.hasNext()) {
			System.out.print(it.next() + " | ");
		}
		System.out.println();
		
		//System.out.println(it.next()); -> NoSuchElementException
		Iterator<Integer> it2 = nums.iterator();
		/*
		 * When using Iterator to loop though a collection,
		 * we can remove objects while looping.
		 */
		while(it2.hasNext()) {
			int val = it2.next();
			if(val > 1000) {
				it2.remove();
			}
		}
		
	   System.out.println(nums.toString());
	   
//	   for(Integer num : nums) {
//		   if(num > 400) {
//			   nums.remove(new Integer(num));
//		   }
//	   }
	   
	   List<String> cities = new ArrayList<>();
	   cities.add("New York");
	   cities.add("Boston");
	   cities.add("Vienna");
	   cities.add("Sterling");
	   //ConcurrentModificationException when removing value using for each loop
//	   for(String city : cities) {
//		   if(city.equals("Boston")) {
//			   cities.remove(city);
//		   }
//	   }
	   
	   
	   
		
		
	}
}