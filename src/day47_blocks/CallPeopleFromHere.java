package day47_blocks;

public class CallPeopleFromHere {
	public static void main(String[] args) {
		
		People myManNursultan = new People();
		System.out.println(myManNursultan.hardToGet);
		System.out.println(myManNursultan.easyToGet);
		System.out.println(People.easyToGet);// because it is static
		
		
		People.whatMyName();// static can be called by the className.methodName();
		myManNursultan.sayMyName();
		myManNursultan.whatMyName();// object can also call 
		
		
	}

}
