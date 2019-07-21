package day65_Collections02;


public class MyExample2 {
	private String nameItem;
	private double priceItem;
	
	
	public MyExample2(String nameItem, double priceItem) {
		this.nameItem = nameItem;
		this.priceItem = priceItem;
	}


	public String getNameItem() {
		return nameItem;
	}


	public void setNameItem(String nameItem) {
		this.nameItem = nameItem;
	}


	public double getPriceItem() {
		return priceItem;
	}


	public void setPriceItem(double priceItem) {
		this.priceItem = priceItem;
	}


	@Override
	public String toString() {
		return "MyExample1 [nameItem=" + nameItem + ", priceItem=" + priceItem + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nameItem == null) ? 0 : nameItem.hashCode());
		long temp;
		temp = Double.doubleToLongBits(priceItem);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		MyExample2 other = (MyExample2) obj;
		if (nameItem == null) {
			if (other.nameItem != null)
				return false;
		} else if (!nameItem.equals(other.nameItem))
			return false;
		if (Double.doubleToLongBits(priceItem) != Double.doubleToLongBits(other.priceItem))
			return false;
		return true;
	}

	
	
	

}
