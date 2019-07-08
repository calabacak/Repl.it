package day63_exception_handling_2;

//CUSTOM CHECKED EXCEPTION. EXTENDS EXCEPTION
public class NeedSomeCoffeeException extends Exception {
	public NeedSomeCoffeeException() {}
	
	public NeedSomeCoffeeException(String message) {
		super(message);
	}
}