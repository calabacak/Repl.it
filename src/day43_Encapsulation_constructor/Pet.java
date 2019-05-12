package day43_Encapsulation_constructor;

public class Pet {
	private  String type;
	private String name;
	
	public Pet(String type, String name) {
		this.type=type;
		this.name= name;
	}
	//
	public Pet() {
		System.out.println("No Args Constructor");
	}
	
	public void speak() {
		switch(type.toLowerCase()){
		case "cat":
			System.out.println("Miyaw");
			break;
		case "dog":
			System.out.println("Hav hav");
			break;
		case "bird":
			System.out.println("Cik cik");
			break;
		case "goat":
			System.out.println("maeeee");
			break;
		case "sheep":
			System.out.println("baaaa");
			break;
		case "rooster":
			System.out.println("u uurruuu uuuuu");
			break;
		default: 
			System.out.println("...");
		}
		
	}
	
	private void swithc() {
		// TODO Auto-generated method stub
		
	}

	public String toString() {
		return "Pet [type=" + type + ", name=" + name + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
