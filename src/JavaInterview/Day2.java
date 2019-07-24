package JavaInterview;

import java.util.Arrays;

public class Day2 {
public static void main(String[] args) {
		
		/*
		 * 0. IS A and HAS A releation ship
		 * Inheritance (is-a) relationships are derived child classes that inherit attributes and methods from their parent class. 
		 * Composition (has-a) relationships are classes whose attributes are comprised of other classes. 
		 * is-a is a concept of inheritance, while  has-a  use the instance variable that reference to other object
		 * 
		 * For Example: Car HAS A Engine and Car IS A Automobile
In programming this is represented as:
class Automobile{} // Automobile class which is parent to Car class.
class Engine {} // The engine class.
// Car is an Automobile, so Car class extends Automobile class.
class Car extends Automobile{
// Car has a Engine so, Car class has an instance of Engine class as its member.
private Engine engine;
}
		 * 
		 * 
		 * 
		 	1. how did you use in your framework?:
		 	Object Oriented Programming takes its power from reflecting the real world analogy.
		 	
		 * INHERITANCE 
		 	All the reusable data we can store it in a class, and rest of the class can inherit them
		 	(inherit all properties of the parent class, code re-usability)
		 	I created a Base Class in my Framework to initialize 
		 	WebDriver interface, WebDriver waits, Property files, Excels, etc., in the Base Class.
		 	I  extended the Base Class in other classes such as Tests and Utility Class. 
		 	Extending one class into other class is known as Inheritance.
		 
		 * POLYMORPHISM
		 	Combination of overloading and overriding is known as Polymorphism.
		 	Polymorphism allows us to perform a task in multiple ways
		 	- METHOD OVERLOADING class having multiple methods with same name but different parameters is called Method Overloading.
		 	For example I used implicit wait in Selenium. Implicit wait is an example of overloading. 
			In Implicit wait we use different time stamps such as SECONDS, MINUTES, HOURS etc.,
		
			- METHOD OVERRIDING We use a method which was already implemented in another class by changing its parameters.
			Declaring a method in child class which is already present in the parent class is called Method Overriding. 
			Examples are get and navigate methods of different drivers in Selenium .
				
		 * ENCAPSULATION
			All the classes in a framework are an example of Encapsulation. 
			In POM classes, we declare the data members using @FindBy and initialization of data members 
			will be done using Constructor to utilize those in methods.
			Encapsulation is a mechanism of binding code and data together in a single unit.
			
		* ABSTRACTION
		  Abstraction in OOP. Objects in an OOP language provide an abstraction that hides the internal implementation details. 
		  Similar to the coffee machine in your kitchen, you just need to know which methods of the object are available 
		  to call and which input parameters are needed to trigger a specific operation.
		  The process of abstraction in Java is used to hide certain details and only show the essential features of the object. 
		  In other words, it deals with the outside view of an object (interface). 
		  The only good example i see for this across different sites is interface.
		  All variables declared inside interface are implicitly public static final variables(constants). 
		  All methods declared inside Java Interfaces are implicitly public and abstract, 
		  even if you don't use public or abstract keyword. Interface can extend one or more other interface.
			
			
		 	
		 	2. abstract class vs interface?
		 	
		 			1. how to create an object from abstract class and interface?
		 						we cannot
		 			
		 			2. can u implement multiple interfaces to an abstract class?
		 					yes
		 			
		 			3. can abstract class be static?
		 				no
		 			
		 			4. can you have finalize method in an interface?
		 					no
		
		
		 	
		 	3. how to swap two numbers without using third variable?
		 				a = a+b;
		 				b = a-b;
		 				a = a-b ;
		 				
		 				int a=10;
						int b=20;
		
				a=a^b; // 10^20=30   a=30
				b=a^b; // 30^20=10   b = 10
				a=a^b; // 30^10=20  a = 20;
				
			System.out.println(a+" "+b);
			
			
		 				
 			4. can we have multiple classes in a single file? Yes
		 			can we have multiple public classes in a single file?
		 			no, only one public class
		 					
		 	
		 	5. what access modifiers can be used for class? public and default
		 	
		 	6. can main method have final keyword?  yes
		 	 can main method have protected access modifier? NO
		 		
		 		
		 		
		 	
		 	
		 	7. how can we monitor JVM in a production Environment?
			 		JConsole
			 		it's one of the monitoring tool that compiles to the 
			 		JMX (Java Management Extension).
		 
		 
		8. reverse a string
		 
		public static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result = result + str.charAt(i);
        }
        return result;
    }
    
    
	    public static String reverse2(String str) {
	        char[] arr = str.toCharArray();
	        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
	            char temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	        }
	        return new String(arr);
	    }
}


String actual2 = new StringBuilder(target).reverse().toString(); // with string builder

//////
public static String reverseLetters(String str) {
        //convert string into array of chars
        //because string is immutable
        //so it's easier to swap values with array
        char[] arr = str.toCharArray();
        //i starts from he beginning 
        // j starts from the end
        for(int i=0, j = arr.length-1; i<j; i++, j--) {
            //until character under position i is not a letter
            //it will keep moving
            while(!Character.isLetter(arr[i])) {
                i++;
            }
            //until character under position j is not a letter
            //it will keep moving
            while(!Character.isLetter(arr[j])) {
                j--;
            }
            //once we have letter from left side and from the right side
            //we can swap them
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //convert array of chars into string
        String result = new String(arr);
        return result;
    }
		 
		 
		 */
	
	
    String sentence = " what we know about iran shooting down a U.S drone";
    String [] arrayOfWords = sentence.split(" ");
    System.out.println(Arrays.toString(arrayOfWords));
    //String [] rev= new String [arrayOfWords.length];
    
    String rev = "";
    for(int i= arrayOfWords.length-1; i>=0; i--) {
        rev+= arrayOfWords[i]+ " ";
    }
    System.out.println(rev.trim());
	
	
}

}