package day64_Collections01;
import java.util.*;

public class ArrayVsList {
	public static void main(String[] args) {
		
		//Array
		
		int[] nums = {30,40,50};
		String [] days = new String[7];
		days[0]="Monday";
		days[1]="Tuesday";
		
		
		//ArrayList
		
		List<Integer> numslist= new ArrayList<>();
		//ArrayList<Integer> numslist= new ArrayList<>();
		numslist.add(44);
		numslist.add(44);
		numslist.add(102);
		numslist.add(46);
		
		
		//ordered, I know which value is where
		System.out.println(nums[0]);
		System.out.println(numslist.get(0));
		
		System.out.println(Arrays.toString(nums));
		System.out.println(numslist);
		
	}

}
