package day53_inheritance06;

public class BoringSchool {
	public static void main(String[] args) {
		
		HighSchoolStudent hss1 = new HighSchoolStudent("McLean High School");
		System.out.println(hss1.toString());
		
		ElementarySchoolStudent ess= new ElementarySchoolStudent("Spring Hill Elemantary School");
		
		System.out.println(ess);
	}

}
