package day30_methods2;

public class GetReversed {
	public static void main(String[] args) {
		
		System.out.println(getReversed("cengiz"));
		System.out.println(isPalindrome("qcivic"));
	}
	
	
	public static String getReversed(String str) {
		
		String strReversed="";
		for(int i= str.length()-1; i>=0; i--) {
			strReversed+=str.charAt(i);
		}
		return strReversed;
	}
	
	public static boolean isPalindrome(String str) {
		
		String strReversed="";
		for(int i= str.length()-1; i>=0; i--) {
			strReversed+=str.charAt(i);
		}
		if(strReversed==str){
			return true;
		}else return false;		
	}

}
