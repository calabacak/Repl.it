package day27_arrays05;

import java.util.Arrays;

public class PractiseInterview {
	public static void main(String[] args) {

		String web = "orange,orange,apple";
		String db = "orange,apple,apple";

		// check 2 strings find the mismatch word and correct it with web

		String[] str1 = web.split(",");
		String[] str2 = db.split(",");

		System.out.println(Arrays.deepToString(str1));
		System.out.println(Arrays.deepToString(str2));

		if (!Arrays.equals(str1, str2)) {
			System.out.println("mismatch");
		} else
			System.out.println("match");

		for (int i = 0; i < str1.length; i++) {
			if (!str1[i].equals(str2[i])) {
				System.out.println(str1[i] + " and " + str2[i] + " do not match");
				str2[i]=str1[i];
			}

		}
		
		System.out.println(Arrays.deepToString(str1));
		System.out.println(Arrays.deepToString(str2));

	}

}
