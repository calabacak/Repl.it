package day42_customclasses_encapsulation;

public class SushiPlace {
	String name;
	double rating;
	String address;
	
	public void setInfo(String nName,double rRating,String newAddress) {
		
		name= nName;
		rating= rRating;
		address=newAddress;
	}
	public void eatSushi() {
		
		System.out.println("Enjoing sushi at "+ name);
	}

}
