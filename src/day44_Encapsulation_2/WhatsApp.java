package day44_Encapsulation_2;

public class WhatsApp {

	private String toNumber;
	private String message;
	private boolean delivered;
	
	
	//if in your class, you have multiple constructors you call one 
	//constructor you can call one constructor from another. THIS() keyword must be the first statement.
	// chaining constructors using this()
	// this() keyword cannot be used in other methods, ONLY in constructors
	
	public WhatsApp() {

		System.out.println("NO-Arg Cons");
		
	}
	public WhatsApp(String toNumber, String message) {
		this();
		System.out.println("TWO-Args Cons");
		this.toNumber= toNumber;
		this.message=message;
		
	}
	
	public WhatsApp(String toNumber) {
		
		this(toNumber, "[]");
		System.out.println("ONE-Arg Cons");
//		this.toNumber= toNumber;
//		this.message="[]";
		
	}
	
	@Override
	public String toString() {
		return "WhatsApp [toNumber=" + toNumber + ", message=" + message + ", delivered=" + delivered + "]";
	}
	public String getToNumber() {
		return toNumber;
	}
	public void setToNumber(String toNumber) {
		this.toNumber = toNumber;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isDelivered() {
		return delivered;
	}
	public void setDelivered(boolean delivered) {
		this.delivered = delivered;
	}
	
	public String startOz(String str) 
	{
	if(str.charAt(0)=='o' && str.charAt(1)!='z')
	{
	  return str.charAt(0)+"";
	}
	else if (str.charAt(0)!='o' && str.charAt(1)=='z'){

	  return str.charAt(1)+"";
	}
	  else if (str.charAt(0)=='o' && str.charAt(1)=='z'){

	  return str.charAt(0)+""+str.charAt(1);
	  }
	
	  return "";
	}
	}