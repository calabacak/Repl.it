package day56_abstraction_02;

//Browser>Chrome&Netscape|TestBrowsers

public class Chrome extends Browser{
	
	// two args constructor, and calling 2 arg constructor from super class
	public Chrome(String name, int id) {
		super(name, id);
 }

	@Override
	public void navigate(String url) {
		System.out.println("Chrome - navigating to " + url);	
	}

	@Override
	public void displayWebpage() {
		System.out.println("Netscape - displaing webPage ");
	}

	@Override
	public boolean launch() {
		System.out.println("Chrome is launching");
		System.out.println("1 2 3");
		return true;
	}
	@Override
	public void close() {
		super.close();
		System.out.println("Exitting Chrome");
	}
}
