package day57_interfaces;

public interface Electric {
	
	public static final boolean HAS_BATTERIES= true;
	 static final int MAX_BATTERIES=100_000;// implicitly "public static final" boolean ....
	
	void charge();// implicitly "public abstract"  public  abstract void charge();
	
}

//Automonous>Electric : interface
//Vehicle parent class
//Tesla inherits from Vehicle and implements Automonous>Electric 
//BMWi8 implements Electric 