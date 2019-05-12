package day41_customClasseses02;

import java.util.Arrays;

public class Test_Employee {
	public static void main(String[] args) {
		
		Employee empl1= new Employee();
		empl1.firstName= "Cengiz";
		empl1.lastName="Alabacak";
		
		Employee empl2= new Employee();
		empl2.firstName="GulNihal";
		empl2.lastName="Alabacak";
		empl1.createEmail();
		empl1.printEmail();
		empl1.setJobTittle("HR");
		
		
		
//		Employee[] it_deparment= new Employee[2];//{empl1,empl2}
//		it_deparment[0]=empl1;
//		it_deparment[1]=empl2;
//		System.out.println(Arrays.deepToString(it_deparment));
		
		empl1.printInfo();
		//empl2.printInfo();
		
	}

}
