package day18_whiledowhileloops;

public class ConvertFromForToWhile {
	public static void main(String[] args) {
		
		int s = 0;
	    int t = 1;
	    for (int i = 0; i < 10; i++)
	    {
	         s = s + i;
	         for (int j = i; j > 0; j--)
	{
	t = t * (j - i);
	         }
	         s = s * t;
	         System.out.println("T is " + t);
	    }
	    System.out.println("S is " + s);
		
		
		
	}

}
