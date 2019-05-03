package HomeWork;

import java.util.Scanner;

public class GetSandwich {
	public static void main(String[] args) {
		int count=0;
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		//String str = "applebreadbuttereggbread";
		
		for(int i=0; i<str.length()-4; i++) {
			
			if(str.substring(i, i+5).equals("bread")) {
				
				count++;
			}
			}//System.out.println(count);
		
		if(count>=2) {
			System.out.println(str.substring(str.indexOf("bread")+5, str.lastIndexOf("bread")));
			//System.out.println(str.lastIndexOf("bread"));
		}else System.out.println("nothing");
	}

}
