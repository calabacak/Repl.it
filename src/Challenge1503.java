
public class Challenge1503 {
	
	public static void main(String[] args) {
		
		//double x=
		conversion(5,104);
		//System.out.println(x + " is this");
		
	} 
	
	public static double conversion(double feet, double inch) {
		
	
		double centimeter;
		
	if (	feet > 0	&& inch > 0	&& inch <= 12		) {
		centimeter = feet*30.48 + inch*2.54;
		System.out.println(centimeter);
		return centimeter;
		
	}else {
		
		System.out.println("Invalid data");
		return -1;
	}
	
	}
	
	public static double conversions() {
		double feet = 5;
		double inch = 11;
		double foot_in_inch;
	
	
	if (feet > 0) {
		foot_in_inch = feet/12;
		System.out.println(foot_in_inch);
		return foot_in_inch;
	}else {
		
		System.out.println("Invalid data");
		return -1;
		
	}
	}

}
