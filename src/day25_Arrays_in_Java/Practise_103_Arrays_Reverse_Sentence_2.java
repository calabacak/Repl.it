package day25_Arrays_in_Java;

public class Practise_103_Arrays_Reverse_Sentence_2 {
	public static void main(String[] args) {
		
		//Given a String variable sentence, write code to get each word and assign to String reversed in reverse order. 
		//
		//Example:
		//sentence -> "Java is fun"
		//reversed -> "fun is Java"
		
		
		String str = "Java is fun cengiz";	
		
		
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i)==' ') {
				System.out.println(str.substring(i, str.indexOf(" ")+i));
				
			}
			
			
		}
		
	
	}

}



