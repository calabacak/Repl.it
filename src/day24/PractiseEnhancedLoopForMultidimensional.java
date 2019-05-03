package day24;

public class PractiseEnhancedLoopForMultidimensional {
	public static void main(String[] args) {
		
		int [][] scores= {	{50,60,70},	{90,50,30,80},	{40,100,30,70,40,70}	};
		
		
		for(int[] student: scores) {
			for(int nums: student) {
				System.out.print(nums+"\t");
			}System.out.println();
		}
	

}
}