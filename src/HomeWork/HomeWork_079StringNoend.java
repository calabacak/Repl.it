package HomeWork;

import java.util.Scanner;

public class HomeWork_079StringNoend {
	public static void main(String[] args) {
		

    Scanner s = new Scanner(System.in);
    String txt = s.next();
    String str=txt.substring(0,txt.length()-1);
    System.out.println(str);
    
    
    

  }
}