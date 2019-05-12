package HomeWork;

public class LameCalculator {
	public static void main(String[] args) {
		
		System.out.println(isPalindrome("Nurses Run"));;
	}
	
	public int plus(int a, int b) {
		return a+b;
	}
	public int minus(int a, int b) {
		return a-b;
	}
	public int multiply(int a, int b) {
		return a*b;
	}
	public int divide(int a, int b) {
		return a/b;
	}
	
	public static boolean isPalindrome(String check) {
	    
	    String palindrome="";
	    String target=check.replace(" ", "");
	    for(int i=target.length()-1; i>=0;i--){
	      palindrome+=target.charAt(i);
	    }
	    System.out.println(palindrome);
	    if(palindrome.equalsIgnoreCase(target)){
	      return true;
	    }
	    return false;
	  }

}
