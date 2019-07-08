package day63_exception_handling_2;

public class CustomExceptionsTest {
	public static void main(String[] args) throws NeedSomeCoffeeException {
		double balance = 2000;
		double transaction = 210;
		
		if(transaction > balance) {
			//throw new InsufficientFundsException();
			throw new InsufficientFundsException("Balance is too low.");
		}else {
			System.out.println("Purschace successful.");
			balance -= transaction;
		}
		
		throw new NeedSomeCoffeeException("getting sleepy");
		
	}
	/*
	 * Write the definition of a class named PanicException that supports the specification of a message. 
	 * In addition, this version of PanicException arranges for the string "PANIC! " appears before the message. 
	 * And if a  PanicException is instantiated without an argument, its associated message will simply be "PANIC!".
	 */
}

