package day53_inheritance06;

public class ElementarySchoolStudent extends Student {

	public ElementarySchoolStudent(String school) {
		super(school);
	}
	
	public String toString() {
		return "elemantary school "+ super.toString();
	}
}
