package day17_LoopsAndConstructors;
import java.util.Scanner;

public class day17_Loops {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" enter your name");
		
		String name = scan.next();
		
		while(!name.contentEquals("cengiz")) {
			
		System.out.println("wrong enter again");	
			
		name = scan.next();
		
		
			
		}
			
			System.out.println("good");
			
			
			
			
		}
		
		
		

}
