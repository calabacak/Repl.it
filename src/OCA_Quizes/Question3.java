package OCA_Quizes;

public class Question3 {
	String name;
	int age=25;
	
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	public Question3(String name) {
		setName(name);
	}
	
	public Question3(String name, int age) {
		setAge(age);
		//setName(name);
	}
	
	public  String show() {	
		return name+" | "+age;	
	}
	
	public static void main(String[] args) {
		
		Question3 p1= new Question3("Jesse");
		Question3 p2= new Question3("Walter",52);
		System.out.println(p1.show());
		System.out.println(p2.show());
	} 
	
	

}
