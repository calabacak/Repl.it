package SpecialTopics;

public class ST_16_string_stringbuffer_difference {
	public static void main(String[] args) {
		
		//String is immutable where as StringBuffer is mutable, lets explain this by an example
		
				String striw= new String("Cengiz");
				
				System.out.println(striw);
				
				striw.concat("alabacak");
				
				System.out.println(striw);
				
				
				StringBuffer striw2= new StringBuffer("Cengiz");
				
				striw2.append("alabacak");
				
				System.out.println(striw2);
				
	}

}
