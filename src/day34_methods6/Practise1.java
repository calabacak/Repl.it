package day34_methods6;

public class Practise1 {
	public static void main(String[] args) {
		
		String s1 = "Java";
		String s2 = "Java";
		StringBuilder sb1 = new StringBuilder(); 
		sb1.append("Ja").append("va"); 
		System.out.println(s1 == s2); //false
		System.out.println(s1.equals(s2)); //true
		System.out.println(sb1.toString() == s1); //false
		System.out.println(sb1.toString().equals(s1));//true
	}

}
