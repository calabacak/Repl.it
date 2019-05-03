package day17_LoopsAndConstructors;
import java.util.Scanner;
public class loopsChallenges {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		int n=5;
		char c = '*';
		
		 
		for(int i=1;i<=n;i++)
		{
		for(int j=1;j<=n-i;j++)
		 
		{
		System.out.print(" ");
		}
		 
		for(int j=1;j<=i*2-1;j++)
		 
		{
		System.out.print(c);
		}
		System.out.println();
		 

	}

}
}
