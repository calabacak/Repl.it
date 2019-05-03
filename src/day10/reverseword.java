package day10;

public class reverseword {
public static void main(String[] args) {
	
	String str = "Cengiz Alabacak is coming home";
	String reversed = "";
	int i;
	
	for (i=str.length()-1; i>=0;i--) {
		
		reversed = reversed + str.charAt(i);
	}
	
	System.out.println("reversed of "+ str + " is "+ reversed);
	
}
}
