package day35_Review;

public class Stringencripted2 {

	
	public static void main(String[] args) {
		
		// without methods;
		
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		
		
		String word= "woodenspoon";
		
		String str ="";
		for(int i= 0 ; i< word.length(); i++ ) {
			
			int b= alphabet.indexOf(word.charAt(i));
			str+= encrypted.charAt(b);
		}

		System.out.println(word);
		System.out.println(str);	
	}

}
