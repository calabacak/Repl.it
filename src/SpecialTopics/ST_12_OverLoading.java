package SpecialTopics;

public class ST_12_OverLoading {
	public static void main(String[] args) {

		String abc = "I love jove";
		int n= 6;
		int aa =10;
		int bb = 20;
		int cc = 30;
		String dd = "this is overloading";

		printWhatIwrite(abc);
		printWhatIwrite(abc,n);
		printWhatIwrite(aa,bb,cc,dd);
		printWhatIwrite(aa);
		
	}
	// method 1
	public static void printWhatIwrite(String str) {
		System.out.println(str);
	}
	// method 2
	public static void printWhatIwrite(String str, int num) {

		System.out.println(str  +" "+num);
	}
	// method 3
	public static void printWhatIwrite(int a, int b, int c, String d) {
		
		System.out.println(a+b+c+" and "+ d);
	}
	// method 4
	public static int printWhatIwrite(int a) {
		System.out.println(a*4/2);
		return a*4/2;
		
	}
}
