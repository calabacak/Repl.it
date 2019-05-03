package day18_whiledowhileloops;

public class Writealoopthatwillcreateanewstringthatisthereverseofagivenstring {
	public static void main(String[] args) {
		
		
		String str = "Writealoopthatwillcreateanewstringthatisthereverseofagivenstring.";
		
		String strReversed = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			
			strReversed = strReversed + str.charAt(i);
		}
		System.out.println(strReversed);
		
	}

}
