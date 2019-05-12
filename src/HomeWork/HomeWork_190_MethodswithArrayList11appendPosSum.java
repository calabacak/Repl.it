package HomeWork;
import java.util.*;

public class HomeWork_190_MethodswithArrayList11appendPosSum {

	public static void main(String[] args)
	{
		
	}
	//create your method below
	
	public static ArrayList <Integer>  appendPosSum(ArrayList <Integer> nums) {
		ArrayList <Integer> result= new ArrayList <>();
			int sum=0;
			for(Integer i: nums) {
				if(i>0) {
					sum+=i;
					result.add(i);
				}
			}
		result.add(sum);
		return result;
		
		
	}
	
	
	
	
	
	
}
