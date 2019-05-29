package day50_inheritance_03;

public class AppsFactory {
	public static void main(String[] args) {
		
		IPhoneApp iApp1= new IPhoneApp();
		IPhoneApp iApp2= new IPhoneApp("Uber");
		
		AndroidApp andrApp = new AndroidApp("Lyft");
		
		System.out.println(iApp1.getName());
		System.out.println(iApp2.getName());
		System.out.println(andrApp.getName());
		App.count=33;// since it is static it share among all classess and objects.
		System.out.println(IPhoneApp.count);
		iApp1.count=56;
		System.out.println(andrApp.count);
		App.build("swift");
		IPhoneApp.build("objective c");
		AndroidApp.build("Java");
		iApp1.build("Python");
		
	}
	
	

}
