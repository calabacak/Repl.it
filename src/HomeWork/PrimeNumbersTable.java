package HomeWork;

//public class HomeWork_227_OOP_18_TableGenerator2 {
//
//}



import java.util.*;

//public class PrimeNumbersTable implements TableGenerator, Primes {
public class PrimeNumbersTable  {


    /**
     *
     * Override isPrime method
     * @param number
     * @return true if number is prime , false if it is not
     */

   // @Override
	 public boolean isPrime(int number) {
	    	if(number<=0 || number==1) {
	    		return false;
	    	}
	    	
	    		for(int j=2; j<number;j++) {
	    			if(number%j==0) {
	    				return false;
	    			}
	    		}
	        return true;  
	    }

    /**
     * Override the abstract method from TableGenerator interface.
     *
     * @param start - start prime numbers sequence from this int
     * @param numberOfEntries - how many prime numbers need to be in returning int[] array
     * @return int[] array with prime numbers
     *
     * Note: Call isPrime method while looking for prime numbers to fill up sequence array.
     *
     * Examples:
     * generateTable(1, 3); => [2, 3, 5] first 3 prime numbers starting from 1 is 2,3,5
     * 1 itself is not prime so it is not in the array.
     *
     *generateTable(5, 3); => [5, 7, 11] first 3 prime numbers starting from 5 is 5,7,11
     *      * 5 itself is prime so it is in the array.
     *
    generateTable(100, 5); => [101, 103, 107, 109, 113] first 5 prime numbers starting from 100.
      100 itself is not prime so it is not in the array.

     */
  //  @Override
    public int[] generateTable(int start, int numberOfEntries) {
       //TODO
       
       return new int[1];
    }


    /**
     * Override checkTable method.
     *
     * Method checks if the array int[] tableToTest contains
     * correct sequence of prime numbers that starts from int start
     *
     * @param start - sequence of prime numbers start from this int
     * @param tableToTest - test the sequence if it is in right order.
     * @return true if 1) all numbers are prime AND
     *                 2) numbers are in asc order AND
     *                 3) the sequence starts from start variable value
     *          return false if any of above conditions is false
     * Examples:
     *
     * int[] p = {101, 103, 107, 109, 113};
     * checkTable(100, p); => true
     *
     * int[] p = {2, 3, 5};
     * checkTable(1, p); => true
     *
     * int[] p = {2, 3, 4, 5};
     * checkTable(1, p); => false because 4 is not prime
     *
     * int[] p = {2, 3, 5};
     * checkTable(5, p); => false because sequence is not starting from 5
     *
     */

  //  @Override
    public boolean checkTable(int start, int[] tableToTest) {
       //TODO:
       
       return false;
    }



}
