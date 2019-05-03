package day23_Arrays;

public class ArrayPractise4 {
public static void main (String[] args) {
	
	String[] names = new String[] {"Cengiz", "Ahmet", "Mehmet", "Ali", "Duru","Ayse","Can","Veli"};
	String[] sorted = new String[names.length];
	
	
	
	String temp;
	int i;
	int j;
	
	for(i= 0; i<names.length-1;i++) {
		for(j=i+1;j<names.length-1;j++);{
			if(		names[j].compareTo(names[i])	<	0			) {
				temp=names[j];
				names[j]=names[i];
				names[i]=temp;
				System.out.println(temp);
				System.out.println("loop is coming");
			}
		}
	}
	for(String element:names) {
		//System.out.println(element);
}
	int a =names[1].compareTo(names[0]);
	System.out.println(a);
	
	
	
	
	
	
	
	
	
	
	
	
	
}

public static String [] getAlphabeticalOrder(String [] names) {
	
	int j;
	String temp;
	for(int i= 0; i<names.length-1;i++) {
		for(j=i+1;j<names.length-1;j++);{
			if(names[j].compareTo(names[i])<0) {
				temp=names[j];
				names[j]=names[i];
				names[i]=temp;
			}
		}
	}
	
	
	
	return(names);
}






}
