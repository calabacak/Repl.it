package day34_methods6;

public class VarArgsPractise1 {
	public static void main(String[] args) {
		
		printWords("cengiz","ali");
	}
	
	public static void printWords(String...str) {
		
		for(String s:str) {
			System.out.println(s);
		}
	}
	
	
	
	

}
