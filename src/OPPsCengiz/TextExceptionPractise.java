package OPPsCengiz;

public class TextExceptionPractise {
	public static void main(String[] args) {
		try {
			distrubute(1200, 0);
		}catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			registeredParticipant("Jack", -18);
		} catch (NegativeNumberException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e+" cengiz");
		}
		
	}
	
	public static void distrubute(int numOfChoclates, int participant) {
		System.out.println(Calculator.divide(numOfChoclates, participant));
		
	}
	
	public static void registeredParticipant  (String name, int age) throws NegativeNumberException {
		Participant p = new Participant();
		p.setName(name);
		p.setAge(age);
		
	}

}
