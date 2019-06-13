package day56_abstraction_02;

//Browser>Chrome&Netscape|TestBrowsers

public abstract class Browser {

	String name;
	static int id;
	/// abstract double price;

	public Browser() {
		System.out.println("Creating a Browser");
	}

	public Browser(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public abstract void navigate(String url);

	public abstract void displayWebpage();

	public abstract boolean launch();

	public void close() {
		System.out.println("Exitting the Browser.");
	}

}
