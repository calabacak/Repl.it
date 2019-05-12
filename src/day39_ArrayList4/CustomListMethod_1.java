package day39_ArrayList4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CustomListMethod_1 {
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		List<Double> arr2 = new ArrayList<>();
		
		List<String> list = new ArrayList<>();
		list.add("11");
		list.add("21");
		list.add("31");
		list.add("41");
		
		
		
		arr.add(10);
		arr.add(20);

		arr2.add(10.4);
		arr2.add(20.4);
		arr2.add(30.4);

		printArray(arr);
		System.out.println();

		System.out.println(sumList(arr2));

		System.out.println(getList(6));
		System.out.println(getListv2(6));
		System.out.println(converToInList(list));

	}

	public static void printArray(List<Integer> nums) {
		for (int i = 0; i < nums.size(); i++) {
			System.out.print(nums.get(i) + " ");
		}

	}

	public static double sumList(List<Double> salary) {

		double sum = 0.0;
		for (Double s : salary) {
			sum += s;
		}
		return sum;
	}

	public static ArrayList<Integer> getList(int size) {
		ArrayList<Integer> result = new ArrayList<>();

		for (int i = 1; i <= size; i++) {
			result.add(i);
		}

		return result;
	}

	// random numbers

	public static List<Integer> getListv2(int size) {
		List<Integer> result = new ArrayList<>();
		Random random = new Random();

		for (int i = 1; i <= size; i++) {
			result.add(random.nextInt(100));
		}
		return result;
	}
//accept a list and return list
	public static List<Integer> converToInList(List<String> list){
		List<Integer> nums= new ArrayList<>();
		
		for(String s:list) {
			//nums.add(Integer.valueOf(s));
			//nums.add(new Integer(s));
			nums.add(Integer.parseInt(s));
		}
		return nums;
		
	}
}
