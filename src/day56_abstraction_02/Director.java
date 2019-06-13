package day56_abstraction_02;

public class Director {
	
	private String name;
	
	public Director(String name) {
		this.name=name;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Director [name=" + name + "]";
	}

	
}
