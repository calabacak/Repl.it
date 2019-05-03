package Most_Frequent_Coding_Questions;

import java.util.Arrays;

public class MF_18_String_Anagram2 {
	public static void main(String[] args) {
		
		System.out.println(findIfAnagram("adana", "anada"));

	}
	public static boolean findIfAnagram(String str1, String str2) {
		
		char [] str1arr= str1.toCharArray();
		char [] str2arr= str2.toCharArray();
		
		Arrays.sort(str1arr);
		Arrays.sort(str2arr);
		
		if(Arrays.equals(str1arr, str2arr)) {
			return true;
		}else 
			return false;
	}	
}
