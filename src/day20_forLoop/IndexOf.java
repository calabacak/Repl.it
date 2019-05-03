package day20_forLoop;

public class IndexOf {
	public static void main(String[] args) {
		
		String word = "acalabacakmazon";
		char letter = 'm';
		int indeks =-1;
		
		for(int i=0; i<=word.length();i++) {
			if(word.charAt(i)==letter) {
				indeks=i;
				break;	
			}
			else i++;
		}
		System.out.println("indexOf "+ " m is "+(indeks));
		
	}

}
