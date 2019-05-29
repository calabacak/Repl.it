package HomeWork;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeWork2_16_Methods_with_ArrayList_14 {

	public static ArrayList<Integer> removeInst(ArrayList<Integer> r, Integer n) {
		 ArrayList<Integer> result= new ArrayList<Integer>();

		int sizenum=0;
		for(int i=0; i<r.size();i++) {
			if(r.get(i)!=n) {
				sizenum++;
			}
		}
		
		int [] num = new int[sizenum];
		int k=0;
		for(int i=0; i<r.size();i++) {
			if(r.get(i)!=n) {
				num[k]=r.get(i);
				k++;
			}
		}
		for(int i=0; i<num.length;i++) {
			result.add(num[i]);
		}
		return result;
	}

	/*
	 * List<String> toRemove = new ArrayList<String>(); for (String str :
	 * myArrayList) { if (someCondition) { toRemove.add(str); } }
	 * myArrayList.removeAll(toRemove); }
	 */
	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>();
		Integer[] nums = new Integer[] {3,5,1,1,2,3,1,4};
		arr.addAll(Arrays.asList(nums));
		System.out.print(removeInst(arr, 1));

	}// end main

}
