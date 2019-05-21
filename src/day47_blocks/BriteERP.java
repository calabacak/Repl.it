package day47_blocks;

import java.time.LocalDateTime;
import static day47_blocks.TestData.*;

public class BriteERP {
	static { //automatically runs in the beginning
		System.out.println("Launch Browser");
		System.out.println("Navigate to: " + url);
	}
	
	public static void enterEmail() {
		System.out.println("Enter email: " + TestData.email);
	}
	
	public static void enterPassword() {
		System.out.println("Enter password: " + TestData.password);
	}
	
	public static void verifyLogin() {
		System.out.println("Expected Name: " + TestData.userName);
		System.out.println("Actual Name displayed: Viktoriia Lugovska");
		System.out.println("Login Successful - " + LocalDateTime.now());
	}
	
}