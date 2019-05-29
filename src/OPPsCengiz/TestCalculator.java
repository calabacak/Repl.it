package OPPsCengiz;

public class TestCalculator {
	public static void main(String[] args) {
		
		int num=100;
		int den=0;
		try {
			int result= Calculator.divide(num, den);
			System.out.println(result);
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		
	}

}
