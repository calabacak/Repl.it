package day43_Encapsulation_constructor;

public class Tesla {
	private String model;//this.model
	private int range;//this.range
	private double price;//this.price
	private double zeroTo60;//this zeroTo60
	private boolean selfDriving;//this.selfDriving
	
	
	
	@Override
	public String toString() {
		return "Tesla [model=" + model + ", range=" + range + ", price=" + price + ", zeroTo60=" + zeroTo60
				+ ", selfDriving=" + selfDriving + "]";
	}
	
	//oString method is used to DESCRIBE the object with values.
	
	
	public void setModel(String model) {
		
		if(isValidModel(model)) {
			this.model= model;//We put this because there are 2 model and this is confusing to java	
		}else {
			System.out.println("invalid model");
			this.model="Unknown";
		}
		
	}
	public String getModel() {
		return model;
	}
	
	public void setRange(int range) {
		this.range=range;
	}
	
	public int getRange() {
		return range;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public double getPrice() {
		return price;
	}
	public void setZeroTo60(double zeroTo60) {
		this.zeroTo60=zeroTo60;
	}
	public double getZeroTo60() {
		return zeroTo60;
	}
	public void setSelfDriving(boolean selfDriving) {
		this.selfDriving=selfDriving;
	}
	public boolean isSelfDriving() {//not get but is while declaring a boolean method
		return selfDriving;
	}
	
	public boolean isValidModel(String model) {
		
		if(model.equalsIgnoreCase("MODEL S")||model.equalsIgnoreCase("MODEL 3") || 
				model.equalsIgnoreCase("MODEL X")|| model.equalsIgnoreCase("MODEL Y")|| model.equalsIgnoreCase("ROADSTER")) {
			return true;
		}
		return false;
	}
	
	/*	
	return model.equals("model s") || 
		   model.equals("model 3") ||
		   model.equals("model x") || 
		   model.equals("model y") ||
		   model.equals("roadster");

	switch(model) {
		case "model s":
		case "model 3":
		case "model x":
		case "model y":
		case "roadster":
			return true;
		default:
			return false;		
	}
	*/
	
	public void setTeslaInfo(String model, int range, double price, double zeroTo60, boolean selfDriving  ) {
//		
//		this.model= model;
//		this.range=range;
//		this.price=price;
//		this.zeroTo60=zeroTo60;
//		this.selfDriving=selfDriving;
		setModel(model);
		setPrice(price);
		setRange(range);
		setZeroTo60(zeroTo60);
		setSelfDriving(selfDriving);
		
	}
	
}
