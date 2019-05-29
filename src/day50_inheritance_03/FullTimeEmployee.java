package day50_inheritance_03;

public class FullTimeEmployee extends Employee{
	
	@Override
	public void calculatePay(int hours, double rate) {
		System.out.println("Full time Employee Total Pay: "+ hours*rate*105/100);
	}

}
