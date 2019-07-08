package day63_exception_handling_2;

public class PanicException extends Exception{
	
	 public PanicException() {
		System.out.println("PANIC!");
	}
	
    public PanicException(String message) {
	  super(message);
	}
	 
	
	
	/*
	 * Write the definition of a class named PanicException that supports the specification of a message. 
	 * In addition, this version of PanicException arranges for the string "PANIC! " appears before the message. 
	 * And if a  PanicException is instantiated without an argument, its associated message will simply be "PANIC!".
	 */
}

