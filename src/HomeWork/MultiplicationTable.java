package HomeWork;

import java.util.Arrays;

public class MultiplicationTable implements TableGenerator{
	//public class MultiplicationTable {
    /**
     * returns a multiplication table of
     * specified number with a specified length.
     * @param value - the multiplication table returned will be of that number
     *              ( for example 5 wil return: 0,5,10,15...).
     * @param numberOfEntries - the number of entries (positions)  the returned array will hold (for example
     *                        if its 3 the returned array will have 3 ints.
     * @return an int array containing a multiplication table.
     *
     * Example:
     *  generate_table(3,5);
     * returns: [0,3,6,9,12]
     *  each number is multiplier of 3, starts from 0
     *
     *  generate_table(9,3);
     *  returns: [0,9,18]
     */
   // @Override
    public int[] generateTable(int value, int numberOfEntries) {
        int [] result= new int[numberOfEntries];
        
        for(int i=0; i<numberOfEntries; i++) {
        	result[i]=i*value;
        }
        return result;
    }

    /**
     * checks if a multiplication table is of the correct values
     * and correct sequence for the given
     * @param value
     * @param tableToTest
     * @return true or false
     * 
     * Please look at examples below:
     * 
     *
    mult = [0,3,6,9,12,15]
    check_table(3,mult);
    returns:true since each number in array is multiplication 
    for 3

    mult = [0,3,6,999,12,15]
    check_table(3,mult);
    returns:false

    mult = [0,9,18]
    check_table(9,mult);
    returns:true

    mult = [0,9,18]
    check_table(3,mult);
    returns:false
     */
    @Override
    public  boolean checkTable(int value, int[] tableToTest) {
    	 int [] result= new int[tableToTest.length];
 
         for(int i=0; i<tableToTest.length; i++) {
         	result[i]=i*value;
         }
         
         return Arrays.equals(result,tableToTest);
    }
    
}

