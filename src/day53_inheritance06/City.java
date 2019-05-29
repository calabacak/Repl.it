package day53_inheritance06;

public class City {
	
	private int id;
	private String name;
	public int count=100;
	
	
	
	
	public City(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "id: "+id + " name: "+name+" count: "+ count;
	}
	
	public static void buildARoad() {
		System.out.println("City is building Road");
	}
	
	
	@Override
	public boolean equals(Object obj) {
		City anotherCity =  (City)obj;
		if(this.id==anotherCity.id && this.name.contentEquals(anotherCity.name)) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return id+name.length();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
