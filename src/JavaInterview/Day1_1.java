 package JavaInterview;


import java.util.ArrayList;
import java.util.Arrays;

class z{
	public static void method1(int a) {
		
	}
	
}
class C extends z{
	
	public static void method1(double a) {
			
		}
	
}


public class Day1_1 {
	
	public static void add(int a) {
		System.out.println(a++);
	}
	public static void main(String[] args) {
		
		String strconcat= new StringBuilder().append("cengiz").append("alabacak").toString();
	//	System.out.println(strconcat);
		String strconcat2= new StringBuffer().append("cengiz").append("alabacak").toString();
		//System.out.println(strconcat2);
		String strconcat3=strconcat2.concat(strconcat);
		System.out.println(strconcat3);
		add(5);
		System.out.println("cengiz".concat("gulnihal"));
		System.out.println(new StringBuilder("abc").append("def"));
		/*
		 
		1. How do you combine two Strings?
			-By  using (+) operator
			-By  using concatenate method (concat()). String strconcat3=strconcat2.concat(strconcat);
			-By StringBuffer
				- String strconcat= new StringBuilder().append("cengiz").append("alabacak").toString();
			-By StringBuilder
				- String strconcat2= new StringBuffer().append("cengiz").append("alabacak").toString();
		
		2. What’s the differences between StringBuffer and StringBuilder? 
				What’s synchronization ?
				Stringbuffer & Stringbuilder: mutable version of sequences of characters
		
				StringBuffer: is synchronized (Thread-safe). 
						all the methods in Stringbuffer contains the specifier "Synchronize"
						
						disadvantages of Synchronization:
										1. Very Slow
										2. performance problem
				
		
		3. Tell me the differences between void and non-void methods?
				-void : does not return any value. The "void" return type means that this method doesn't have a return type.
				In an application, this approach may be used to print runtime specific messages on the console
				-non-void: MUST return a Value.(Data type needs to be same with return-type)
				This means that you can use the returned value in your code for further processing. 
				I guess good examples of such methods are "getters". 
		
		
		4. Can you explain what is 'public static void' ?
				public is access modifier. visible to the world. Public means that the method is visible and can be called from other objects of other types.
				static is specifier, any feature that has static , belongs to the class.This means that you can call a static method without creating an object of the class. 
				void is a return type, the method does not return any value. void means that the method has no return value.	
				
				
						
		
		5. Briefly explain the differences between Array and ArrayList
		They are used to store multiple values in a single variable, 
					1. First and majaor Array is fixed size, ArrayList is dynamic size(expanded or shrinked)
					2. ArrayList does not support primitive
					3. Array can be multi-dimensional (ArrayList can be also multidemensional) it's considered as list of lists, not multi-dimensional
									
		
		6. What are the primitives and wrapper classes in java? Their differences
		Primitive types are the most basic data types available within the Java language. 
		There are 8: boolean , byte , char , short , int , long , float and double . 
		These types serve as the building blocks of data manipulation in Java.
		Wrapper classes: Byte, SHort, Integer, Long, Float, Double, Boolean, CHaracter
			
			//All the wrapper classes (Integer, Long, Byte, Double, Float, Short) are subclasses of the abstract class Number. 
			The object of the wrapper class contains or wraps its respective primitive data type. 
			Converting primitive data types into object is called boxing, and this is taken care by the compiler.
			
					differences: 
							1. Wrappers classes are object 
							2. null can only be assigned to classes
							3. Wrapper class does have methods
							4. Primitives does have default values
									default value of primitives:  byte, short, int, long ==> 0
											 float, double ==> 0.0;
											 boolean ==> false;
											 char ==> empty
											 
							5. Default values of wrapper class: null
			
			
		7. Explain me the method overloading and method overriding? 
				Return type of overloaded method should be same or not?
				Can you overload and override the constant methods?
				Method overloading is a programming technique 
				that allows developers to use the same method name 
				multiple times in the same class, but with different parameters. 
				Overloading makes your code cleaner and easier to read, 
				and it may also help you avoid bugs in your programs. 
				code re-usability and flexibility
				overload: any method can be overload
						  same name different parameters
						  return type does not have to be same
						  access modifiers does not matter
						  can be overload in same or sub class
						   
				adjust the implementation
				Override: only instance methods can be overriden ( no final, no private)
							Same Name, same parameters(same signature)
							return type and parameter needs to be same
							Access modifier needs to be same or more visible.
							Must be override in sub class
							@override annotation can be applicable
		
		8.	differences between instance variable, class variables and local variables? 
					-instance variable belongs to the object. It has a separate copy for each instantiated object.
					-class variables (static variable): belongs to the class, can be called through class name, 
					class variables only have one copy that is shared by all the different objects.
					-local variable: declared within the method or blocks. Their scope is limited to method or block limits.
					They are not visible outside the method.
				
		
		9.	what’s an instance method ? What is static method?
				instance method belongs to the object. 
				Requires an object of its class to be created so that it can be called.
				static method belongs to the class, can be called without	 creating an object of its class
				declared with static key word. 
				(there is no object instances in static method, so in order to call non static we must create the object)
				- can we call static method from non-static vice versa	
		 			 I can not call a non static method from  static method, because there is no object.
		 			 (i can only if i have ceated an object)
		 			 But I can call a static method from non static/static method because if there is a static method there is a class.
		 			 
		10.	what’s constructor? Declaration ?
				special method with no return.
				declaration:   Access Modifier  className(parameter), can only have AM, classname and parameters
				execution depends on the object
				super
				this
		
		11.	inner class VS outer class
				1. can Outer class be static?  no
				2. Can inner class be static?  Yes
				3. Can you create an object from the inner class?
						only if it's static
				4. can we have main method in inner class ?
						only if it's static
				 inner class can only be extended if it's static.
				
		
		12.	what are the blocks in java that you have used in your framework?
				blocks: static, instance, finally
				
				- static block-Static block in java is executed every time when a class loads once .
					Static block is a normal block of code enclosed in braces { } and is preceded by static keyword.
					so static block executed first. Not inherited.
				
				- instance block- Instance Initialization Blocks: Runs every time when the instance of the class is created.
					so next Initialization block executed when instance of the class is created.
					then Constructor executed. 
					lets create a B object:
					clasA, clasBextendsA = staticA, staticB, initA, constructorA then init B, constuctorB.
					
					
				- constructor-This is invoked at the time of object creation and 
					a constructor is invoked by object of that class only. 
			
				contractor and instance blocks also never participate in inheritance.
				
				 
				A subclass inherits all the members (fields, methods, and nested classes) from its superclass. 
				Constructors are not members, so they are not inherited by subclasses, 
				but the constructor of the superclass can be invoked from the subclass by using super(),super(...)and 
				these must be first executable statements. Because instance variables CANNOT be overridden in Java. 
				In Java only methods can be overridden.
				When you declare a field with the same name as an existing field in a superclass, 
				the new field hides the existing field. 
				The existing field from the superclass is still present in the subclass, 
				and can even be used ... subject to the normal Java access rules.
				
		
		13.	What is difference between final, finally and finalize in Java?
			final and finally are keywords in java whereas finalize is a method.
				*final is a specifier:
						can only be applicable to methods, variables, and class
						final keyword can be used with class variables so that they can’t be reassigned, 
						with class to avoid extending by classes and with methods to avoid overriding by subclasses,
						
				*finally: 
				finally keyword is used with try-catch block to provide statements that will always gets executed even if some exception arises.
				Java finally block is a block that is used to execute important code such as closing connection, stream etc. 
				Java finally block is always executed whether exception is handled or not. 
				Java finally block follows try or catch block..
				Usually finally is used to close resources
				
				*finalize() method is executed by Garbage Collector before the object is destroyed, 
				it’s great way to make sure all the global resources are closed.
				
				finally:
	code in finally block runs always, even if exception happens or no. Unless there is System.exit(0) statement, or JVM crash.

	In finally block, i normally put clean up code, that closes any open files, database connections etc.
	Application of finally block: So basically the use of finally block is resource deallocation. 
	Means all the resources such as Network Connections, Database Connections, 
	which we opened in try block are needed to be closed, so that we won’t lose our resources as opened. 
	So those resources are needed to be closed in finally block. 
	The finally block is a key tool for preventing resource leaks. 
	When closing a file or otherwise recovering resources, place the code in a finally block to 
	ensure that resource is always recovered.

finalize method
	It is a method that the Garbage Collector always calls just before the deletion/destroying 
	the object which is eligible for Garbage Collection, so as to perform clean-up activity.


				
				
				
				
		
		14. What is toString method in java?
				it's used to convert object to String
				The toString() method returns the string representation of the object.
		
		15. Did you use Encapsulation in your framework? 
					How?  What’s the befits of using encapsulation ?
		 We use encapsulation to hide the variables (and prevent its being manipulated without your approval or consent) and impose a control by
		 putting conditions on the initial and following assigning values
		 I achieve encapsulation by  putting access modifier private in front of the variables and creating
		 public getter setters in which I can declare my conditions/control mechanism.
		 * Protect your variable by making it private
		 * I can control how the value is being initialized
		 * I can control how you are setting value by creating conditions in your setter;
		
		Your assignment:
	1. Create a return method that can remove duplicated values from an Integer ArrayList.
	  		Do not use Set interfaces.
	  		
	2. Create a method that can divide two numbers without using division operators and Math class.
		 break till: 6:15pm
		 
		 */
		
		StringBuffer strbuffer =new StringBuffer("Name");
			// convert StringBuffer to String:
		
			String str = strbuffer.toString();
			
			ArrayList< ArrayList<String> > list= new ArrayList<>();
				// list.add("Cybertek");
				ArrayList<String>  list1 = new ArrayList<>();
					list.add(list1);
		
		Integer num1 = 10;
				num1.toString();
				
			int num2 = 10;
		//		num2.toString();
			
			
		//	public int a=10;  local variables cannot have AM, and all specifier (except for final)

	}
	
	private static Object Stringbuilder() {
		// TODO Auto-generated method stub
		return null;
	}

	// in StringBuilder:
	public  void  Append(StringBuilder str) { 
		return;
	}
	
	// in StringBuffer: Synchronization:
	public synchronized void Append (StringBuffer str) {  }
	
	
	public static void result( int num1, int num2) {
		System.out.println(num1/num2);
	}

}
