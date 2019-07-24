package day65_Collections02;

public class ComparebleInterfarceDemo implements Comparable<ComparebleInterfarceDemo> {

	private int id;
	private String name;

	public ComparebleInterfarceDemo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ComparebleInterfarceDemo [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(ComparebleInterfarceDemo otherObj) {
		if (this.id > otherObj.id) {
			return 1;
		} else if (this.id < otherObj.id) {
			return -1;
		}
		return 0;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ComparebleInterfarceDemo other = (ComparebleInterfarceDemo) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	

}
