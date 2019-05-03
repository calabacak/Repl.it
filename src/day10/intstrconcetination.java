package day10;

public class intstrconcetination {
	
	public static void main(String[] args) {
		
		int hour, minutes;
		String hoursAndminutes;
		
		
		hour=3;
		minutes = 45;
		
		hoursAndminutes = hour + " s" + "and "+ minutes + "m";
		
		if (hour<10) {
			
			hoursAndminutes = "0"+hour + " s " + "and "+ minutes + "m";
			
			System.out.println(hoursAndminutes);
		}
		
		else System.out.println(hoursAndminutes);
		
		
		
	}

}
