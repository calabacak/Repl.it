package day65_Collections02;
import java.util.*;
public class LoopSet {
	public static void main(String[] args) {
		//Set<Integer> numsSet = new TreeSet<>(Comparator.reverseOrder());
		Set<Integer> numsSet = new HashSet<>();
		numsSet.add(10);numsSet.add(1034);numsSet.add(1545840);numsSet.add(12320);
		numsSet.add(16560);numsSet.add(10121);numsSet.add(154540);numsSet.add(121210);
		
		System.out.println(numsSet.size());
		System.out.println(numsSet.toString());
		
		for(int n : numsSet) {
			System.out.print(n + " | ");
		}
		System.out.println();
		
		//Loop using For Loop will not work. it is not ordered and not have indexes.
		
		//forEach method with lambda
		numsSet.forEach(n -> System.out.print(n + " | "));
	
		System.out.println();
		
		
		
		
	}
}