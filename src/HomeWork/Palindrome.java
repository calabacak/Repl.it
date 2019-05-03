package HomeWork;

public class Palindrome {
	public static void main(String[] args) {
		
		String str = "racecar";
		
		String reversed = "";
		
		for(int i = str.length()-1; i>=0; i--) {
			reversed+= str.charAt(i);
		}System.out.println(reversed);
		if(str.equals(reversed)) {
			System.out.println(str + " is a palindrome");
		}else System.out.println(str + " is NOT A palindrome");
	}

}
