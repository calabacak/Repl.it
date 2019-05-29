package SpecialTopics;

public class ST_15_ConvertAStringNumberToIntType {
	public static void main(String[] args) {

////////1. converting a string number to int type 
		String str = "1234";
		int strint = Integer.valueOf(str);
		System.out.println(strint + 1);
		
////////converting a string number to int type
		String str2 = "4567";
		int strint2 = Integer.parseInt(str2);
		System.out.println(strint2 + 1);

////////converting an int number to string type	
		int a = 4321;
		String astr = String.valueOf(a);
		System.out.println(astr + 1);
		
////////converting an int number to string type	
		int b = 5432;
		String astr2 = Integer.toString(b);
		System.out.println(astr2 + 1);
////////converting an int number to string type:)	
		int c = 5432;
		String astr3 = ""+c;
		System.out.println(astr2 + 1);

/////// any other way to convert a string number to integer number? lets see;

		String myNumber = "987543210";

		char[] arr = myNumber.toCharArray();
		System.out.println(arr.length);
		int[] arrNum = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arrNum[i] = arr[i];
		}
		for (int num : arrNum) {

			System.out.println(num - 48);// it is coming + 48 :) so substract it.
		}
		int[] arrNumSubrated = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arrNumSubrated[i] = arrNum[i] - 48;
		}

		for (int num : arrNumSubrated) {

			System.out.print(num);
		}

		System.out.println();
		System.out.println("============");
		int temp = arrNumSubrated[0] + arrNumSubrated[1];
		System.out.println(temp);

///////and now build the number from the digits, be careful where to start you operation.		
		
		int myNumberAsInt = 0;
		for (int i = arrNumSubrated.length - 1; i >= 0; i--) {
			int result = (int) Math.pow(10, arrNumSubrated.length - 1 - i);
			myNumberAsInt += arrNumSubrated[i] * result;
		}
		System.out.println(myNumberAsInt);
	}
}