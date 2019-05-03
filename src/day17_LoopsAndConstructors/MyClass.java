package day17_LoopsAndConstructors;

public class MyClass {
	public static void main(String[] args) {
		
		
		CubeVolume cube1 = new CubeVolume(); // CubeVolume is the name of the class where we created the method.  
	 System.out.println("the volume of the cube is " + cube1.getCubeVolume());
	 
	 cube1.setBredth(10);
	
	 CubeVolume cube2 = new CubeVolume(2,4,6);

	 System.out.println("the volume of the cube is " + cube2.getCubeVolume());
	
	 
	}
	

}
