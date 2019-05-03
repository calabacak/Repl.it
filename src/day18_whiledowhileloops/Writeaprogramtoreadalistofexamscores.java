package day18_whiledowhileloops;

import java.util.Scanner;

public class Writeaprogramtoreadalistofexamscores {
	public static void main(String[] args) {
		
		int NumOfScoreA = 0; 
		int NumOfScoreB = 0; 
		int NumOfScoreC = 0; 
		int NumOfScoreD = 0; 
		int count=1;
		int sum = 0;
		int score = 0;
		
		Scanner scan = new Scanner(System.in);
		
		//System.out.println("enter the score");
//		
//		int score = scan.nextInt();
//		
//		if (score>=90 && score<=100)
//			NumOfScoreA = NumOfScoreA+1;
//		
//		if (score>=80 && score<=89)
//			NumOfScoreB = NumOfScoreB+1;
//		
//		if (score>=70 && score<=79)
//			NumOfScoreC = NumOfScoreC+1;
//		
//		if (score>=60 && score<=69)
//			NumOfScoreA = NumOfScoreA+1;
		
		
		while(score>=0) {
			
			System.out.println("enter the score");
			
			score = scan.nextInt();
			count = count+1;

			if (score>=90 && score<=100)
				NumOfScoreA = NumOfScoreA+1;
			
			if (score>=80 && score<=89)
				NumOfScoreB = NumOfScoreB+1;
			
			if (score>=70 && score<=79)
				NumOfScoreC = NumOfScoreC+1;
			
			if (score>=60 && score<=69)
				NumOfScoreA = NumOfScoreA+1;
			
		
			
			sum = sum + score;
		}
		
		System.out.println(NumOfScoreA);
		System.out.println(NumOfScoreB);
		System.out.println(NumOfScoreC);
		System.out.println(NumOfScoreD);
		System.out.println(count);
		System.out.println(NumOfScoreA+NumOfScoreB+NumOfScoreC+NumOfScoreD);
		System.out.println(sum/count);
		
	}

}
