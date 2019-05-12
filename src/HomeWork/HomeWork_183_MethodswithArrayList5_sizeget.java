package HomeWork;

import java.util.*;

public class HomeWork_183_MethodswithArrayList5_sizeget {
	public static void main(String[] args) {

	}

	public static int sum(ArrayList<Integer> ints) {
		// write code here
		int sum = 0;
		for (int i = 0; i < ints.size(); i++) {
			sum += ints.get(i);
		}
		return sum;
	}
}
