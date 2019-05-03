package day15;

public class Warmup {
	public static void main(String[] args) {
		
		
		String str=":/";
		
		if(str.length()!=2) {System.out.println("invalid input"); 
		return;
		}
		
		if((str.charAt(0))==':' && (str.charAt(1))==')') {
			System.out.println("smile");
			
		}else if((str.charAt(0))==':' && (str.charAt(1))=='(') {
				System.out.println("sad");
		}else if((str.charAt(0))==':' && (str.charAt(1))=='/') {
			System.out.println("upset");
		}else {
				System.out.println("invalid emoji");
				
		}
		}
		
		
	}


