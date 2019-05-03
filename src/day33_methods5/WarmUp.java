package day33_methods5;

public class WarmUp {
	public static void main(String[] args) {
		
		System.out.println(add(10));
		//addvoid(10);

	}

	public static int add(int num) {
		int result = 0;
		for (int i = 0; i < num; i++) {
			result += i;
		System.out.println(result);
		}
		return result;
	}
	
	public static void addvoid(int num) {
		int result = 0;
		for (int i = 0; i < num; i++) {
			result += i;
			System.out.println(result);
		}
		System.out.println(result);

	}

}
