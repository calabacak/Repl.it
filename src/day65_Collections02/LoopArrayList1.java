package day65_Collections02;
import java.util.*;
public class LoopArrayList1 {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(50);nums.add(543);nums.add(1150);nums.add(550);nums.add(570);
		nums.add(90);nums.add(5330);nums.add(1150);nums.add(50666);nums.add(950);
		
		//Loop using FOR EACH LOOP
		for( int n : nums) {
			System.out.print(n +" | ");
		}
		System.out.println();
		
		//Loop using For Loop
		for(int i = 0; i < nums.size(); i++) {
			System.out.print(nums.get(i) + " | ");
		}
		System.out.println();
		
		//forEach method of Java 8
		/*forEach method comes from Iterable interface
		 * and we need to pass a lambda expression.
		 * Lambda expression is part of java functional programming
		 * that started from Java 8.
		 * It is used to pass an implementation while programming.
		 * we need to use -> operator
		*/
		nums.forEach( n -> System.out.print(n + " | ") );
		
		System.out.println();
		
		nums.removeIf(n -> n < 500);
		
		nums.forEach( n -> System.out.print(n + " | ") );
		
		//nums.stream() can also be used to manipulate data in the collections.
		
		/*
		 * All actions that Java functional programming can also be achieved using
		 * traditional for each/for loops.
		 * functional programming is only for shorter code and faster programming.
		 * in general in java functional programming is slower than traditional loops
		 */
		
		
		
		
		
	}
}