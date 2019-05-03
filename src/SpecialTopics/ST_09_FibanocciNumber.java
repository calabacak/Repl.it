package SpecialTopics;

public class ST_09_FibanocciNumber {
	public static void main(String[] args) {

		int[] Fibanocci = new int[15];

		Fibanocci[0] = 1;
		Fibanocci[1] = 1;

		for (int i = 2; i < Fibanocci.length; i++) {
			Fibanocci[i] = Fibanocci[i - 1] + Fibanocci[i - 2];
		}
		for (int num : Fibanocci) {
			System.out.println(num);
		}
	}

}
