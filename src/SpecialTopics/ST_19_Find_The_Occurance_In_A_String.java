package SpecialTopics;

public class ST_19_Find_The_Occurance_In_A_String {

	/*
	 * find the number of occurrence of a string type data in an other string
	 */
	public static int findTheOccurrence(String str1, String str2) {
		int count = 0;
		for (int i = 0; i < str1.length() - (str2.length()-1); i++) {//be careful about the upper bound
			if (str1.substring(i, i + str2.length()).contentEquals(str2)) {// be careful about where to cut
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		String s1="cengiz alalabacakal";
		String s2="al";
	int a=	findTheOccurrence(s1,s2);
	System.out.println(a);
		
	}
}
