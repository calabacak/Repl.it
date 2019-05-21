package day46_static_keyword;

public class CompanyTest {
	public static void main(String[] args) {
		
		System.out.println(Company.cname);
		
		System.out.println(Company.cname.toUpperCase());
		
		Company.cname.toUpperCase();// className.variableName.method();
		System.out.println();// class.variable.method();
		
		Company c = new Company();
		System.out.println(c.cname);
		c.companyInfo();
		
	}

}
