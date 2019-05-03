package day20_forLoop;

public class CountAChar {
	public static void main(String[] args) {
		
		String sentence = " cengiz calabacakc";
		
		char myChar = 'c';
		int count = 0;
		
		for(int i= 0; i<=sentence.length()-1;i++) {	
			if(sentence.charAt(i)==myChar) {
				count = count +1;	
			}else count = count;
		}System.out.println(count);
	}

}
