package OCA_Quizes;
 class Vowel{
	  char var;
	 
}


public class question19 {
	
	
	 public static void main(String[] args) {
		
		char var1='a';
		char var2=var1;
		
		//System.out.println(var1+" "+var2);
		var2='e';
		
		Vowel obj1= new Vowel();
		Vowel obj2=obj1;
		obj1.var='i';
		obj1.var='o';
		
		//System.out.print(var1+", "+var2);
		//System.out.println(obj1.var+", "+obj2.var);
		System.out.println();
		
		
	
	}
	
	

}
