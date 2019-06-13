package day56_abstraction_02;

public class Redbox {
	public static void main(String[] args) {
		Director director1= new Director("Steven Spielberg");
		
		Action action1= new Action("PG-13",4310,"Saving Private Ryan",director1);
		Action action2= new Action("PG-13",4310,"Coming back Home",director1);
		
		System.out.println(action1.toString());
		
		System.out.println(action1.calcLateFees(6));
		
		//System.out.println(action1.equals(action2));
		System.out.println(action1.equals(action2));
	}

}