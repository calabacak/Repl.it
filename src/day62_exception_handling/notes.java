package day62_exception_handling;

public class notes {
	
	/*
	 * In Java each errors and exceptions are objects
	 * 
	 * In  java
	 * 		may- fail expected
	 * 		dont- expect to fail not expected because // not a compiler error but runtime error
	 * 
	 * 
	 * Exception non-typical exceptional condition that signal a piece of code could not execute normally
	 * You expect it to run properly until the end
	 * Then at line 5 there was an error.  and the code throws exception and execution stops at that point.
	 * in this kind of situations we have the option to handle if error/exception takes place. 
	 * Exception handling is to tell Java what to do if error/exception happens.
	 * Exception handling is any type of action to process any kind of error.
	 * 
	 * catch recover notify diagnose
	 * 
	 * try catch block is used to do exception handling java
	 * 
	 * 
	 * try{
	 *		....some code that might throw exception....
	 * }catch(Exception e){
	 * 		....TODO....
	 * }
	 * 
	 * Java runs the code in try block and  if any exception happens catch block will catch that exception 
	 * and run the code in catch block . I f no error exception happens catch block will not run.
	 * 	
	 * 
	 * 
	 * Java Code Execution flow:
	 * HelloWWorld.java====>Compile====>HelloWorld.class===>Run
	 * 
	 * Automation.java--->Compile--->Run(execute)
	 * 
	 * ERROS IN JAVA:
	 * 
	 * 	1.Compiler errors: Syntax errors, data types, crate object of interface etc. We can not use try and catch block to handle this problem.
	 *  We need to go back and fix our code, save it and run again.
	 *  2. Errors / Exception during the code execution:
	 *  	1. Error that takes place during execution
	 *  	2. Runtime EXCEPTION, takes place during execution.
	 *  
	 *  
	 *  
	 *  
	 *  After compiling successfully compiles and wit can be executed 2 types of issues might happen:
	 *  	1. Errors during run time(Runtime ERROR):
	 *  			ex:StackOverFlow error (stack memory is full)
	 * 				   outOfMemoryErrror(Heap memory is full)
	 * 			we do not use try catch t handle this type of errors
	 * 
	 * 		2. Runtime Exceptions:
	 * 			This is THE MOST COMMON and try catch block is used to handle these issues.
	 * 			ex: IndexOutOfBoundsExcepiton, NoSuchElementException
	 * 
	 * 
	 * Exceptions are object in Java
	 * when runtime exception happens java will catch it and assign a variable in catch statement.
	 * 
	 * try{
	 * code}catch Exception e{
	 * 
	 * }
	 * 
	 * After it is successfully caught we can use a variable and call some methods on the object.
	 * 
	 * 	1.Popular ones are
	 * 		e.printStackTrace(): prints the exception stack trac.Step by step execution 
	 * that lead to the problem. It also show the line numbers.
	 * 		e.getMassage(); returns only the description of the exception.
;
	 * 
	 * what is try catch used for?
	 * setProperyt.....
	 * WebDriver driver= new ChromeDriver();
	 * driver.get("https://etsy.com") get waits for the page load
	 * driver.quit()
	 * 
	 * try{
	 * 	 * driver.get("https:cybertekschool.com")
	 * }catch(NoScuchSessionException e){
	 * e.printStackTrace();
	 * driver= new ChromeDriver();
	 * driver.get("https:cybertekschool.com")
	 * 
	 * }

	 * ===========================
	 * In java you can also use finally blocks along with try catch blocks. 
	 * Code that is in finally block runs always even if there are exceptions or no exceptions.
	 * 
	 * try{
	 * 		code
	 * }catch(){
	 * 		code
	 * }
	 * finally{
	 * 		code that runs always run
	 * }
	 * 
	 *
	 * Even if I have a return in my code, code in finally block will run anyway.
	 * Finally block always run except in two situations.
	 *  	1. System.exit(0);
	 *  	2. JVM crash
	 *  
	 * What if there is exception in finally block?
	 * the code will stop in the finally block execution
	 * 
	 * 
	 * STACKOVERFLOW ERROR
	 * Any time, we call a method in Java, it crates a frame in stack memory, if a method keeps calling itself and there is no ending
	 * condition. eventually stack memory gets full.
	 * And we will see <Stackoverflow> warning
	 * 
	 * 
	 * 2 TYPES OF EXCEPTIONS
	 * 	1. CHECKED	Exception : it is an exception we MUST handle for the code to COMPILE.
	 * 		or the code WONT COMPILE; we need to handle (try catch finally)or declare  
	 * 		ex: filenotfound
	 * 	If you do not handle code will not compile.
	 * 	2. UNCHECKED Exception : Optional to handle
	 * 		ex: indexoutofbounds
	 * 		
	 * SUMMARY
	 * 	Exception Handling
	 * 	Try catch finally
	 *  Checked vs unchecked
	 *  examples
	 *  
	 *  
	 *  UDAYAN
	 *  An exception event or error that arises during the execution of a program
	 *  
	 *  you are going to an interview, you car broke down(exception), you call a taxi and arrive on time(handle).
	 *  but if you have an emergency at home you can not handle it.
	 *  
	 *  - traditional exception handling
	 *  	open the file
	 *  	read the contends
	 *  	close the file
	 *   basically if else if else check and move to next steps with business logic
	 *   
	 *   instead separate from the business 
	 *   try{
	 *   	open the file
	 *  	read the contends
	 *  	close the file
	 *   
	 *   }catch(){
	 *   cannot open
	 *   }
	 *  catch(){
	 *  cannot read
	 *   }
	 *   catch(){
	 *   cannot close
	 *   }
	 *   
	 *   lecture 105 minute 6 read file example
	 *   
	 *  object
	 *  	Throwable
	 * 		  Error(unchecked as well)
	 * 			nothing to do outofmemoryError stockoverflowmemoryError
	 * 		  Exception
	 * 			Checked
	 * 				RuntimeException Unchecked
	 * 				
	 * difference:
	 * checked and unchecked
	 *	checked exception we have either handle by try/catch or declare. Both waits for our approval, we just choose and compiler do the rest.
	 *
	 * 
	 *  What is difference between Checked and Unchecked Exception in Java?
1.-Checked Exceptions should be handled in the code using try-catch block or 
else method should use throws keyword to let the caller know about the checked exceptions 
that might be thrown from the method. 
-Unchecked Exceptions are not required to be handled in the program or to mention them in throws clause of the method.

2.Exception is the super class of all checked exceptions whereas RuntimeException 
is the super class of all unchecked exceptions. 
Note that RuntimeException is the child class of Exception.
Checked exceptions are error scenarios that requires to be handled in the code, 
or else you will get compile time error. 
For example, if you use FileReader to read a file, 
it throws FileNotFoundException and we must catch it in the try-catch block or 
throw it again to the caller method. 
3.Unchecked exceptions are mostly caused by poor programming, 
for example NullPointerException when invoking a method on an object reference 
without making sure that it’s not null. For example, 
I can write a method to remove all the vowels from the string. 
It’s the caller responsibility to make sure not to pass null string. 
I might change the method to handle these scenarios but ideally the caller should take care of this.
	 *  
	 *  
	 *  https://www.journaldev.com/2167/java-exception-interview-questions-and-answers
	 *  
	 *  Exception Handling(Make sure you mention it in your resume)
	 *  	Good at handling Java and automation related exceptions
	 *  		using try catch an other techniques
	 *  	Strong Java programming Skills including OOP, Core Java, Exception Handling, Data Structure etc.
	 *  
	 *  how do you do exception handling in Java?
	 *  I use try catch finally block to handle any  exceptions in my code
	 *  I am familiar with major checked and unchecked exceptions and handle it accordingly to make my code execution smooth.
	 *  
	 *  What are some exceptions types that you handled? Memorize
	 *  
	 *  Java: Unchecked: indexoutofbounds exception while working with strings arrays
	 *  NullPointerexception if i forget to instantiate objects
	 *  NumberFormatException, ClassCastException
	 *  Checked: IOException, SQLException, FileNotFoundException
	 *  SELENIUM: NoSuchElementException, NoSuchFrameException, NoSuchAlerException,NoSuchSessionException,
	 *  
	 *  How do you prevent exception?
	 *  For unchecked exceptions I try to use conditional statements and control the flow of the 
	 *  
	 *  Explain catch finally blocks in Java?
	 *  try block: code that is protected for any exceptions 
	 *  catch block : if any exception happens during runtime in the any block catch block will catch that exception.
	 *  
	 *  
	 *  
	 *  
	 *  =========
	 *  
	 *Exception handling:

IQ: How do you do exception handling in Java?

I use try catch finally block to handle any exceptions in my code. I am familiar with major checked and unchecked exceptions and handle it accordingly to make my code execution smooth.

IQ: What are some exception types that you handled?
JAVA: UNCHECKED: indexoutbounds exception while working with strings , arrays.
NullPointerexception if i forget to instantiate objects.
NumberFormatException, ClassCastException

--CHECKED: IOException, SQLException, FileNotFoundException, InterruptedException.

SELENIUM: NoSuchElementException, NoSuchFrameException, NoSuchAlert Exception, NoSuchSessionException, InvalidXpath ~~
All Selenium related exceptions are UNCHECKED.

IQ: How do you prevent exceptions?
To prevent unchecked exceptions, I try use conditional statements and control the flow of the code.
------------------
Make sure to mention in your resume:
	~ Good at Handling Java and automation related exceptions. Using try catch and other techniques.

	Strong Java programming skills including Core Java, OOP, Exception handling, data structures, String manipulation etc.
------------------
06/24/2019
-----------

Office hours.
-------------


06/24/2019
-----------

Office hours.
-------------


Exception handling:

IQ: How do you do exception handling in Java?

I use try catch finally block to handle any exceptions in my code. I am familiar with major checked and unchecked exceptions and handle it accordingly to make my code execution smooth.

IQ: What are some exception types that you handled?
JAVA: UNCHECKED: indexoutofbounds exception while working with strings , arrays.
NullPointerexception if i forget to instantiate objects.
NumberFormatException, ClassCastException

--CHECKED: IOException, SQLException, FileNotFoundException, InterruptedException.

SELENIUM: NoSuchElementException, NoSuchFrameException, NoSuchAlert Exception, NoSuchSessionException, InvalidXpath ~~
All Selenium related exceptions are UNCHECKED.

IQ: How do you prevent exceptions?
To prevent unchecked exceptions, I try use conditional statements and control the flow of the code.
------------------
Make sure to mention in your resume:
	~ Good at Handling Java and automation related exceptions. Using try catch and other techniques.

	Strong Java programming skills including Core Java, OOP, Exception handling, data structures, String manipulation etc.
------------------

IQ: Explain try catch finally blocks in Java?

try block: code that is protected for any exceptions

catch block: if any exception happens during runtime in the try block, catch block will catch that exception. 

if any exception happens during runtime in the try block, control will be given to catch block.

for catch block to work, exception that took place needs to match the exception in catch block.

try{
	int i = 10 /0; //ArithmeticException
}catch(NullPointerException n) {
	//do something
}

try{
	int i = 10 /0; //ArithmeticException
}catch(ArithmeticException n) {
	//do something
}



try{
	int i = 10 /0; 
}catch(RuntimeException n) {
	//do something
}

try{
	int i = 10 /0; 
}catch(Exception n) {
	//do something
}

try{
	int i = 10 /0; 
}catch(Throwable t) {
	//do something
}
==============================

finally:
	code in finally block runs always, even if exception happens or no. Unless there is System.exit(0) statement, or JVM crash.

	In finally block, i normally put clean up code, that closes any open files, database connections etc.

try{
	A
}catch(Exception e) {
	B
}finally{
	C
}
D
======================

IQ: What are major categories of exceptions in Java?

1) Checked Exceptions: We must handle or declare checked exceptions, otherwise code will not compile.
	Throwable, Exception and all sub classes of Exception are checked exceptions , except RuntimeException.

	2 Options:
		1) handle -> try catch block
		2) declare -> using throws keyword in the method definition


2) UnChecked Exceptions: it is optional for a programmer to handle them. code will still compile and run.

Best thing to do is to prevent them as much as possible. or if is it not predictable, we can use try catch statements.



public static void main(String[] args){ // throws Throwable
		File file = new File("products.txt"); //products.txt is in project level
		Scanner scanner = null;
		try {
			scanner = new Scanner(file);//read the file into scanner object
			while(scanner.hasNextLine()) { //loop as long as there are lines of value
				System.out.println(scanner.nextLine()); //read the value of current line and switch to next line
			}
		}catch(Throwable t) {
			System.out.println("File not found!!!");
			t.printStackTrace(); //print exception stacktrace
		}finally {
			try { //handle possible nullpointer exception
				scanner.close();
			}catch(NullPointerException e) {
				System.out.println("NullPointer is caught in finally block!");
			}
		}
		
		System.out.println("END OF PROGRAM. BYE");
	}
=========================================

IQ: What is the super class of all exceptions in Java?
Throwable class is the parent class of all runtime ERRORS, and EXCEPTIONS.

--------

Unchecked:
	- All subclasses of RunTimeException
	- Unchecked exceptions do not need to be handled for the code to compile
	- They occur/happen due to programming mistakes 
	- Ex: ArrayIndexOutOfBoundsException, ClassCastException, NoSuchElementException, NullPointerException
	ArithmeticException,


Checked:
	- All Subclasses of Throwable or Exception except RuntimeException are checked exceptions
	- Checked Exceptions need to be HANDLED OR DECLARED for the code to compile
	- Ex: FileNotFoundException, IOException, ClassNotFoundException, SQLException
	
=================================

public static int getNum() {
	try{
		return 10;
	}catch(Exception e) {
        System.out.println("Exception!");
        return 5;
	}finally{
		System.out.println("Finally");
	}
}


int j = getNum(); //

IQ: Will FINALLY block execute in method body, if there is return statement in try or catch block?

YES! finally always runs!	 *  

====================
		2 Types or Exceptions
			1. Checked Exceptions, must be handled otherwise will not COMPILE
				How?
					Handled(try catch)
					Declared(throws) 
			All Subclasses of Exception except RuntimeException and its subclasses
			
			methods printStackTrace and getMessage
				
			2. Unchecked Exceptions:
				Code will compile even if handled or not
				RunTimeException and all its Subclasses
				Happens due to programming mistakes
				it is optional to handle them
				Declaring Unchecked exceptions is also optional and will only serve as a documentation.
	 
	COMBINATIONS
		1. try{
			}catch(Exception e){
			}
			
			
	 	2. try{
			}catch(Exception e){
			}finally{
			}
			
			
			
		3. try{
			}catch(RunTimeException e){
			}Exception{
			}
			
			
		4. try{
			}catch(RunTimeException e){
			}Exception{
			}finally{
			}
			
			
		5. try{
			}finally{
			}
			
			
			
	THROW AND THROWS
	
	throw keyword: to create exeption programmatically
	throws keyword to declare that 		
			
	 */
	
	

}
