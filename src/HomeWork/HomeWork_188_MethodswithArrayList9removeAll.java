package HomeWork;

import java.util.*;

public class HomeWork_188_MethodswithArrayList9removeAll {

	public static void main(String[] args) {
		ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));

		String targetWord = "hi";

		removeAll(wordList, targetWord);

	}

	public static void removeAll(ArrayList<String> wordList, String targetWord) {

		 ArrayList<String> result = new ArrayList<>();

		for (int i = 0; i < wordList.size(); i++) {

			if (!wordList.get(i).contentEquals(targetWord)) {
				result.add(wordList.get(i));
			}
//			if (wordList.get(i).contentEquals(targetWord)) {
//				result.remove(wordList.get(i));
//			}
		}

		//System.out.println(result);
		System.out.println(result);
	}

}
