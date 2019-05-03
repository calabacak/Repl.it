package day18_whiledowhileloops;

public class HalfDiamond2 {
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
	}

}
// I have one for loop and under it two sub for loops. sub and first sub loop gives me the left side of the triangle
// first loop and the second sub for loop(third for loop) gives me the right side of the triangle.