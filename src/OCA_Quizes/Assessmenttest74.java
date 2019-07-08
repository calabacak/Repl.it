package OCA_Quizes;

public class Assessmenttest74 {
	/*
	 * Complete the sumColumn method so that given a 2-D int array and an integer representing the column to sum, sum up the all elements in that column in the given array.
	 */

	public static void main(String[] args) {
		int[][] array = { {1,2,3,4},
						  {3,1,4,5},
						  {5,4,3,2},
						  {3,3,3,3}};
		int a=0;
		
		System.out.println(sumColumn(array,a));
	}
	
	public static int sumColumn(int[][] array, int column)
	{
		int sum=0;
		for(int i=0; i<array.length;i++) {
			
			sum += array[i][column];
			
		}
		
		return sum;
		
	
}
}