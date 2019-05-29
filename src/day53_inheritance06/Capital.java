package day53_inheritance06;

public class Capital extends City{
	
	private long population;
	public int count=1;
	
	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public Capital(int id, String name, long population) {
		super(id, name);
		this.population=population;
	}
	
	public static void buildARoad() {
		System.out.println("Capital City is building Road");
	}
	
//	public void displayCount() {
//		super(id,name);
//		
//	}
	
	@Override
	public String toString() {
		return super.toString()+ " population: "+this.population+" countCap "+ count;
	}

}
