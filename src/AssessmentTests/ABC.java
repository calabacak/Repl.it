package AssessmentTests;

import java.util.Arrays;

public class ABC {
	public static void main(String[] args) {
		
		
	}
	
	public static void reduce10(int[][] nums)
	{
		
		for(int i=0; i<3;i++) {
			for(int j=0; j<4;j++) {
				nums[i][j]=nums[i][j]-10;
			}
		}
		System.out.println(Arrays.toString(nums));
	}

}
