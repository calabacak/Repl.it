package day18_whiledowhileloops;

public class CountTheBlankSpaces {
	public static void main(String[] args) {
		
		String sentence ="Write a loop that will count the number of blank characters in a given string.";
		
		System.out.println(sentence.length());
		
		String sentencewihtoutspace= sentence.replace(" ", "");
		
		int numOfSpaces = sentence.length()-sentencewihtoutspace.length();
		
		System.out.println(numOfSpaces);
		int count = 0;
		for(int i = 0; i<=sentence.length()-1;i++)
			if(		sentence.charAt(i)==' ')				{
				count= count+1;
			}

System.out.println(count);
		
		
		
	}

}
