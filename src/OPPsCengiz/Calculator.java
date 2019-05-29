package OPPsCengiz;

public class Calculator {
	public static int divide(int num, int den) {
		if(den==0) {
			throw new DenominatorZeroException("Denominator is ZERO"); 
		}
		int res= num/den;
		return res;
	}

}
