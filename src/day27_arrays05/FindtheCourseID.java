package day27_arrays05;

import java.util.Arrays;

public class FindtheCourseID {
	public static void main(String[] args) {
		
		String course="https://learn.cybertekschool.com/courses/144";
		//String JavaProgramming="https://learn.cybertekschool.com/courses/147";
		
		//String TeamActivity="https://learn.cybertekschool.com/courses/144";
		
		//String SDLC="https://learn.cybertekschool.com/courses/149";
		
		
		String [] courses= course.split("/");
		
		System.out.println(Arrays.toString(courses));
		
		System.out.println(Integer.valueOf(courses[courses.length-1]));
		
		//int a= Integer.valueOf(courses[courses.length-1]);not reccomended
		  int b= Integer.parseInt(courses[courses.length-1]);//recomended
		

		///converting
//		if(b==147) {
//			System.out.println("JavaProgramming");
//		}if(b==144) {
//			System.out.println("TeamActivity");
//		}if(b==149) {
//			System.out.println("SDLC");
//		}
		
		///////with switch/////////

		switch(b) {
		case 147:
			System.out.println("JavaProgramming"); break;
		case 144:
			System.out.println("TeamActivity"); break;
		case 149:
			System.out.println("SDLC"); break;
		default:
			System.out.println("invalid");
			
		}

//	wihtout converting	
//		if(courses[courses.length-1].contentEquals("147")) {
//			System.out.println("JavaProgramming");
//		}if(courses[courses.length-1].contentEquals("144")) {
//			System.out.println("TeamActivity");
//		}if(courses[courses.length-1].contentEquals("149")) {
//			System.out.println("SDLC");
//		}
//				
	}

}
