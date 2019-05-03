package SpecialTopics;

public class ST_22_StringToIntegerViceVersa {
	public static void main(String[] args) {
		
		System.out.println(converToInt("1234"));
		System.out.println(converToInt("4321"));
		System.out.println(add(converToInt("1234"),converToIntv2("4321")));
		
		System.out.println("======================");
		
		System.out.println(converToString(456));
		System.out.println(converToString(645));
		System.out.println(concatinate(converToString(456), converToStringv2(645)));
		
		
	}
	///string to integer
	
	public static int converToInt(String num) {
		int numString= Integer.parseInt(num);
		return numString;
	}
	public static int converToIntv2(String num) {
		int numString= Integer.valueOf(num);
		return numString;
	}
	
	
	public static int add(int num1, int num2) {
		
		return (num1+num2);
	}
	
	////////// integer to string
	
	public static String converToString (int num) {
		String result = ""+num;
		return result;
	}
	
	public static String converToStringv2 (int num) {
		String result = String.valueOf(num);
		return result;
	}
	
	public static String concatinate(String str1, String str2) {
		
		return (str1+str2);
	}
	
	
	
	

}
