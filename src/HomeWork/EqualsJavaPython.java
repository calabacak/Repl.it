package HomeWork;

import java.util.Scanner;

public class EqualsJavaPython {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		String sentence = scan.nextLine();
		
		//String sentence = "java I love java and java python java python python and python";
		int countj=0;
		int countp=0;
		//////////////////////////////////////////
		for(int i =0; i<sentence.length()-3; i++) {
			if(sentence.substring(i,i+4).equals("java")) {	
				countj+=1;
			}
		} 
		/////////////////////////////////////////
		
		for(int i =0; i<sentence.length()-5; i++) {
			if(sentence.substring(i,i+6).equals("python")) {	
				countp+=1;
			}
		}
		//////////////////////////////////////////////
		if(countj==countp) {
			System.out.println(true);
		}else System.out.println(false);
		
		
			
	}

}
