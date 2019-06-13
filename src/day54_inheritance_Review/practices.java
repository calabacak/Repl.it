package day54_inheritance_Review;

public class practices {
	
	public practices(int a, double d, boolean b) {
		System.out.println("Number is: "+a);
		System.out.println("GPA is: "+d);
		System.out.println("Passed: "+b);
		
	}
	public static void main(String[] args) {
	//	practices obj = new practices(100, 4.0, false);
		
		child obj2= new child("",false, '7'); 
	}

}
class child extends practices{
	
	public child( String a, Boolean c, char d) {
		super( 100, 200, false);
		}
	
	
	
	
	
}




