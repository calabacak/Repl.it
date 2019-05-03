package day24;

import java.util.Arrays;

public class PractiseVariousTopics {
	public static void main(String[] args) {

		String sentence = "Java is a general-purpose computer-programming language that is concurrent, "
				+ "class-based, object-oriented, and specifically designed to have as few implementation "
				+ "dependencies as possible.";

		String[] words = sentence.split("-");

		System.out.println(words.length);
		for (String x : words) {
			System.out.println(x);
		}
		System.out.println("=============================");
		Arrays.sort(words);

		System.out.println(words.length);
		for (String y : words) {
			System.out.println(y);
		}
		System.out.println("=============================");

		System.out.println(Arrays.toString(words));
		System.out.println("=============================");
		String[] names = { "ahmet", "mehmet", "Cengiz", "burak" };
		String namesv1 = Arrays.deepToString(names);

		System.out.println(namesv1);
		System.out.println(namesv1.substring(namesv1.indexOf("mehmet"), namesv1.indexOf("burak")));
		System.out.println("================================");

		String sentence2 = "I love to study java";

		char[] charOfsentence2 = sentence2.toCharArray();

		System.out.println(Arrays.toString(charOfsentence2));

		System.out.println("========================");

		Arrays.parallelSort(charOfsentence2);

		System.out.println(Arrays.toString(charOfsentence2));
		
		
		
		
		
		String CompareStr="cengiz";
		
		int a = CompareStr.compareTo("cenga");
		
		System.out.println(a);
		
		
		
		
		
		
		
		
		
		

	}
}