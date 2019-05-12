package day43_Encapsulation_constructor;

public class MicroCenter {
	public static void main(String[] args) {
		
		Computer comp1= new Computer();
		Computer comp2= new Computer();
		Computer comp3= new Computer("macBook Pro", "IOS", 1500);
		
		//System.out.println(comp1.toString());
		
		comp1.setBrand("iMac");
		comp1.setOs("macOS High Sierra");
		comp1.setPrice(2567);
		
		comp2.setBrand("Dell XPS");
		comp2.setOs("Windows 10");
		comp2.setPrice(1300);
		//System.out.println(comp1.toString());
		System.out.println(comp3.toString());
		
		
		comp3.setPrice(comp3.getPrice()-450);
		System.out.println(comp3.toString());
	}

}
