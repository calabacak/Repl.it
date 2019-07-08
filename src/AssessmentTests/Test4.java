package AssessmentTests;

import java.util.*;

public class Test4 {
	public static void main(String[] args) {
		// ("hi","yo","sup","yolo","boop")
		// ("yo","yolo")

		String[] str = { "cengiz", "Gul", "Ceyda", "Ceren", "Duru" };
		List<String> urls = Arrays.asList(str);
		List urls2 = Arrays.asList(str);
		ArrayList<String> word = new ArrayList<>();
		word.add("Cengiz");
		word.add("Gul");
		word.add("Ceyda");
		word.add("Ceren");
		word.add("Duru");
		Collections.sort(word);
		System.out.println(word);
		
	}
	// removeEveryOther(word);
	public static void removeEveryOther(ArrayList<String> word) {

		for (int i = 0; i < word.size(); i++) {
			word.remove(word.get(i));
		}
		System.out.println(word);

	}

	public static boolean isSort(int[] nums) {

		List<Integer> listnum = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			listnum.add(nums[i]);
		}

		return false;
	}
}
// sort an Arraylist: Collections.sort(listnum);
// compare two arrays: Arrays.equals(arr1,arr2);
// compare two ArrayList: list1.equals(list2);
// List <String> urls = Arrays.asList(str);
