package day10;

import java.util.*;

public class FindMaxNumber {
	public static void main(String[] args) {
		int [] intArr = {74,8,12,25,56};
	Arrays.parallelSort(intArr);
	
	for (int i=0; i<intArr.length; i++)
		
	{System.out.println(intArr[i]);}
	System.out.println("min of intArr = " + intArr[0]);
	System.out.println("max of intArr = " + intArr[intArr.length-1]);	
	}

}
