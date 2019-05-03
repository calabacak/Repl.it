package day10;

public class getDurationString {
	public static void main(String[] args) {
		
		getDurationString(61,110);
	}  
	// 1st method
	
	public static String getDurationString(int minutes, int seconds) {
		
		int hour;
		String res;
		hour = (minutes/60);
		minutes = (minutes%60);
		seconds = seconds;
		if (	(seconds<0)	||	(seconds>60)){
		System.out.println("invalid data");
		return "including invalid data";}
//		
 		else if (	(minutes<0)){
		//System.out.println("invalid data");
		return "including invalid data";
		}
		else{
		res = hour + "h\t" + minutes + "min\t" + seconds + "s";
		System.out.println(res);
		return res;
		}
		
		
		
		
	}
	
	

}
