package day56_abstraction_02;
//Browser>Chrome&Netscape|TestBrowsers
public class TestBrowsers {
	
	public static void main(String[] args) {
		
				//Browser br = new Browser(); cannot instanstiate an object from abstact class!
				Chrome ch1=new Chrome("abc",73);
				ch1.displayWebpage();
				ch1.navigate("54.23.444.987");
				
				Browser.id = 100;
				System.out.println(Browser.id);
				Integer integer;
		
	}

}
