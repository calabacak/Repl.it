package day18_whiledowhileloops;

public class HalfDiamond {
	public static void main(String[] args) {

		for(int i =0; i<=5; i++) //number of rows
		{
			for(int j=4; j>=i;j--) 
			{
				System.out.print(" ");// notice it is print creates the left empty part of the triangle
			}
			for(int k = 1; k<=(2*i+1);k++)//  notice it is print number of the stars based on the i value on the first row; and so on. 
											//Also the total of stars at the last row. 
			{
				System.out.print("*");//  notice it is print 
			}
			System.out.println();
		}
		
		
		for(int l =4; l>=0; l--) //number of rows
		{
			for(int m=4; m>=l;m--) 
			{
				System.out.print(" ");// notice it is print creates the left empty part of the triangle
			}
			for(int n = 1; n<=(2*l+1);n++)//  notice it is print number of the stars based on the i value on the first row; and so on. 
											//Also the total of stars at the last row. 
			{
				System.out.print("*");//  notice it is print 
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
// I have one for loop and under it two sub for loops. sub and first sub loop gives me the left side of the triangle
// first loop and the second sub for loop(third for loop) gives me the right side of the triangle.