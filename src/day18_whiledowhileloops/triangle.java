package day18_whiledowhileloops;

public class triangle {
	public static void main(String[] args) {
		
		String letters="";
		char myLetter = 'A';
		
		while(myLetter<='Z') {
			
			letters = letters + myLetter;
			
			myLetter++;
			
			
			System.out.println(letters);
			
		}
				System.out.print(letters);
				
	}

}
