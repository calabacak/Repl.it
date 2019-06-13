package day55_abstraction;

public class Employee {
	private String name;
	private int id;

	Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String toString() {
		return "name: " + name + " | id: " + id;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Employee) {
			Employee emp = (Employee) obj;
			boolean result = this.getName() == emp.getName() && this.getId() == emp.getId();
			return result;
		}

		return false;
	}

}
