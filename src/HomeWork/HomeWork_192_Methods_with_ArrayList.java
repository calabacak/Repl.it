package HomeWork;
import java.util.*;

public class HomeWork_192_Methods_with_ArrayList {
	public static void main(String[] args){
		
		
	}
	//create your method below
	
	
	public static void timesTwo(ArrayList<Integer> nums) {
		
		for(int i=0; i<nums.size();i++) {
			
			nums.set(i, 2*nums.get(i));
		}
	}
	
}