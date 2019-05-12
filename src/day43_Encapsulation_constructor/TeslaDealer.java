package day43_Encapsulation_constructor;

public class TeslaDealer {
	public static void main(String[] args) {
		
		Tesla tesla1= new Tesla();
		Tesla tesla2= new Tesla();
		
		tesla1.setModel("Model s") ;
		tesla1.setRange(310);
		tesla1.setPrice(51450);
		tesla1.setZeroTo60(3.2);
		tesla1.setSelfDriving(true);
		
		tesla2.setTeslaInfo("ROADSTER", 620, 250000, 1.9, true);
		
//		System.out.println("Model: "+tesla1.getModel()+"| Range: "+ tesla1.getRange()+ "| Price: "+ tesla1.getPrice()+ 
//				"| Zero To 60: "+ tesla1.getZeroTo60()+"| Is Self Driving: "+ tesla1.getZeroTo60());
//		
//		
		System.out.println(tesla1);// to string yaparsak dogrudan print yapabiliriz. rigth click source to string;
		/*
		 * even if we do not mention toString, it is automatically calling the toString Method
		 */
		System.out.println(tesla1.toString());
		
		System.out.println(tesla1.isValidModel("model s"));
		
		System.out.println(tesla2.toString());
		
		
		if(tesla1.getZeroTo60()>tesla2.getZeroTo60()) {
			System.out.println(tesla2.getModel()+ " is faster");
		}else {
			System.out.println(tesla1.getModel()+" is faster");
		}
		
		buy(tesla1);
		
	System.out.println(testDrive("Model S"));
	}
	public static void buy(Tesla car) {
		
		System.out.println("Purchasing "+ car.toString());
		
	}
	
	public static Tesla testDrive(String model) {
		System.out.println(" Hi I would like to test drive" + model);
		System.out.println(" Sure hold on let me build it for you and return it");
		
		Tesla car= new Tesla();
		
		car.setTeslaInfo(model, 450, 25000, 2.5, true);
		
		
		return car;
	}
	

}
