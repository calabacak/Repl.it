package day26;

import java.util.Arrays;
import java.util.Random;

public class Popular_names2 {
	public static void main(String[] args) {
		
		
		String [] names = {
				"James","Mary",
				"John","Patricia",
				"Robert","Jennifer",
				"Michael","Linda",
				"William","Elizabeth",
				"David","Barbara",
				"Richard","Susan",
				"Joseph","Jessica",
				"Thomas","Sarah",
				"Charles","Margaret",
				"Christopher","Karen",
				"Daniel","Nancy",
				"Matthew","Lisa",
				"Anthony","Betty",
				"Donald","Dorothy",
				"Mark","Sandra",
				"Paul","Ashley",
				"Steven","Kimberly",
				"Andrew","Donna",
				"Kenneth","Emily",
				"George","Carol",
				"Joshua","Michelle",
				"Kevin","Amanda",
				"Brian","Melissa",
				"Edward","Deborah",
				"Ronald","Stephanie",
				"Timothy","Rebecca",
				"Jason","Laura",
				"Jeffrey","Helen",
				"Ryan","Sharon",
				"Jacob","Cynthia",
				"Gary","Kathleen",
				"Nicholas","Amy",
				"Eric","Shirley",
				"Stephen","Angela",
				"Jonathan","Anna",
				"Larry","Ruth",
				"Justin","Brenda",
				"Scott","Pamela",
				"Brandon","Nicole",
				"Frank","Katherine",
				"Benjamin","Samantha",
				"Gregory","Christine",
				"Raymond","Catherine",
				"Samuel","Virginia",
				"Patrick","Debra",
				"Alexander","Rachel",
				"Jack","Janet",
				"Dennis","Emma",
				"Jerry","Carolyn",
				"Tyler","Maria",
				"Aaron","Heather",
				"Henry","Diane",
				"Jose","Julie",
				"Douglas","Joyce",
				"Peter","Evelyn",
				"Adam","Joan",
				"Nathan","Victoria",
				"Zachary","Kelly",
				"Walter","Christina",
				"Kyle","Lauren",
				"Harold","Frances",
				"Carl","Martha",
				"Jeremy","Judith",
				"Gerald","Cheryl",
				"Keith","Megan",
				"Roger","Andrea",
				"Arthur","Olivia",
				"Terry","Ann",
				"Lawrence","Jean",
				"Sean","Alice",
				"Christian","Jacqueline",
				"Ethan","Hannah",
				"Austin","Doris",
				"Joe","Kathryn",
				"Albert","Gloria",
				"Jesse","Teresa",
				"Willie","Sara",
				"Billy","Janice",
				"Bryan","Marie",
				"Bruce","Julia",
				"Noah","Grace",
				"Jordan","Judy",
				"Dylan","Theresa",
				"Ralph","Madison",
				"Roy","Beverly",
				"Alan","Denise",
				"Wayne","Marilyn",
				"Eugene","Amber",
				"Juan","Danielle",
				"Gabriel","Rose",
				"Louis","Brittany",
				"Russell","Diana",
				"Randy","Abigail",
				"Vincent","Natalie",
				"Philip","Jane",
				"Logan","Lori",
				"Bobby","Alexis",
				"Harry","Tiffany",
				"Johnny","Kayla"};
		
		System.out.println("================female names=========");
		for (int i = 1; i < names.length; i = i + 2) {
			System.out.print(names[i]+" ");
		}
		System.out.println();
		System.out.println("================male names=========");
		for (int i = 0; i < names.length; i = i + 2) {
			System.out.print(names[i]+" ");
		}
		
		System.out.println();
	
		
		

		System.out.println("================random names=========");
		
		Random random = new Random();
		
		int r = random.nextInt(names.length);
		
		System.out.println("random name "+ names[r]);
		
		
		
		System.out.println("================3 letter names=========");
		
		int count = 0;
		
		for(String name:names) {
			if(name.length()<=4) {
				count ++;
				System.out.print(name+"\t");
			}
		}
		System.out.println();
		System.out.println(count);
		
		
		System.out.println("================3 4 5 6 7 letter names=========");
		
		
		String namesUpto4= "";
		String names5to6= "";
		String names7orMore= "";
		
		
		
		for(String name:names){
			
			if(name.length()<=4) {
				namesUpto4+=name+", ";
			}else if(name.length()>=5  && (name.length()<=6    )) {
				names5to6+=name+", ";
			}else if(name.length()>=7 ) {
				names7orMore+=name+", ";
			}
		}
		
		System.out.println("======upto4=======");
		System.out.println(namesUpto4.substring(0, namesUpto4.length()-2));
		System.out.println("======5==6========");
		System.out.println(names5to6.substring(0, names5to6.length()-2));
		System.out.println("========7==more=======");
		System.out.println(names7orMore.substring(0, names7orMore.length()-2));
		
		
		System.out.println("==============swap==names===============");

		String temp = "";
		for (int i = 0; i < names.length; i = i + 2) {
			temp = names[i];
			names[i] = names[i + 1];
			names[i + 1] = temp;
		}
		for (String name : names) {
			System.out.print(name+" ");
		}
	}
}

