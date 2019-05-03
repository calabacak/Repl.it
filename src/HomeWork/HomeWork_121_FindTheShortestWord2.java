package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork_121_FindTheShortestWord2 {
	public static void main(String[] args) {
		
String		str= "olive, fish, hot pursuit, old, warning, python, java, coffee, cat, ray";
//		output: [cat, old, ray]
		
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();

		String[] strArr = str.split(", ");

		String temp = "";
		for (int i = 0; i < strArr.length; i++) {
			for (int j = i + 1; j < strArr.length; j++) {
				if (strArr[j].length() < strArr[i].length()) {
					temp = strArr[j];
					strArr[j] = strArr[i];
					strArr[i] = temp;
				}
			}
		}
		//System.out.println(Arrays.toString(strArr));
//		System.out.println(strArr[0].length());
//		System.out.println(strArr[0]);
//	    
//	    for(String s:strArr) {
//	    	if(s.length()==strArr[0].length()) {
//	    		System.out.println(s);
//	    	}
//	    }

		String strnew = "";

		for (int i = 0; i < strArr.length; i++) {

			if (strArr[i].length() == strArr[0].length() ) {
				strnew += strArr[i] + ",";
			}
		}
		//System.out.println(strnew);
		
		
		
		
		

		String[] sen = strnew.split(",");
		Arrays.sort(sen);
		System.out.println(Arrays.toString(sen));

	}
}

