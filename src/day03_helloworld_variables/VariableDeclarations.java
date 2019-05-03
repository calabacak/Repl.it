package day03_helloworld_variables;

public class VariableDeclarations {
	
	public static void main(String[]args) {
		// declare single variable
		int apples;
		// declare multiple variables in single statements;
		int bananas, oranges, mango;
		
		// declare variable and assing value in a single statement
		
		int kiwi=14;
		
		System.out.println(kiwi);
		
		// declare and assign values to multiple variables in a single statement
		
		int watermelon=11,grapes=100, cherries=12, apricots;
		
		System.out.println(watermelon +grapes  );
		System.out.println(grapes  );
		
		
		String[]names=new String[5];
		String[]LastNames=new String[5];
		names[1]= "cengiz";
		System.out.println(names[1]);
		int[]scores=new int[4];
		scores[0]=85;
		scores[1]=70;
		scores[2]=95;
		scores[3]=90;
		
		
		int avarage=(scores[0]+scores[1]+scores[2]+scores[3])/4;
		
		System.out.println(avarage);
		
		
		
		
		
	}

}
