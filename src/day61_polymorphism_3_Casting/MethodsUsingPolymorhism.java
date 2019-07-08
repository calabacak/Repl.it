package day61_polymorphism_3_Casting;

import java.util.Scanner;

//import day49_inheritance02.TV;
import day57_interfaces.Tesla;
//import day60_polymorhism02.*;
import day60_polymorphism_2.AppleDevice;
import day60_polymorphism_2.AppleWatch;
import day60_polymorphism_2.IPad;
import day60_polymorphism_2.Mac;

public class MethodsUsingPolymorhism {
	public static void main(String[] args) {
		purchase( new Mac() );//AppleDevice ap = new Mac();
		
		AppleDevice dev = new AppleWatch();
		purchase(dev);
		
		givemeAnyObject(new String("hi"));
		givemeAnyObject(new Scanner(System.in));
		givemeAnyObject(new day49_inheritance_02.TV());
		givemeAnyObject(new Tesla());
		givemeAnyObject(55);//auto box to Integer
		int n = 33;
		givemeAnyObject(n);
		
		Object tv = new day49_inheritance_02.TV();
		Object str = new String("java");
		Object d = new AppleWatch();
		
		Object o = new Object();
		
	}
	
	public static void purchase(AppleDevice ap) {
		System.out.println("Purchasing: " + ap.getClass().getSimpleName());
	}
	
	public static void givemeAnyObject(Object object) {
		System.out.println("You gave me: " + object.getClass().getSimpleName());
	}
	
	//Method buildAppleDevice, return type: AppleDevice
	public static AppleDevice buildAppleDevice() {
//		AppleDevice ap = new AppleWatch();
//		return ap;
		//we can return object from Mac, IPad, AppleWatch classes
		
		return new IPad();
	}
	
	/*
	 * You need to know inheritance hierarchy
	 * AppleDevice > IPad
	 *             > AppleWatch
	 *             > Mac
	 * By looking at the hierarchy above, it means we can write methods
	 * that return or accept AppleDevice and pass any Sub class object.
	 */
	
	public static AppleDevice buildDevice(String type) {
		if(type.equals("ipad")) {
			return new IPad();
		}else if(type.equals("mac")) {
			return new Mac();
		}else if(type.equals("applewatch")) {
			return new AppleWatch();
		}else {
			return null;
		}
	}
	
	
}

