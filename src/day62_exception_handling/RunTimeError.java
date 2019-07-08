package day62_exception_handling;

public class RunTimeError {
	static int a=0;
	public static void main(String[] args) {
		go();
		
	}
	public static void go() {
		System.out.println(a+" going");
		a++;
		go();
	}
}
