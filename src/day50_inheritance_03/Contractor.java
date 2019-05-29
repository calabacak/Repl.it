package day50_inheritance_03;

public class Contractor extends Employee{
	
	@Override
	public void calculatePay(int hours, double rate) {
		System.out.println("Constructor Total Pay: "+ ((hours*rate)+(200)));
	}

}
