package day50_inheritance_03;

public class Company {
	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		FullTimeEmployee femp1= new FullTimeEmployee();
		Contractor con1= new Contractor();
		
		emp1.calculatePay(40, 45);
		femp1.calculatePay(40, 45);
		con1.calculatePay(40, 45);;
		
		
	}

}
