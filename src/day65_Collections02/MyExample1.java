package day65_Collections02;

import day10.comparetwoarrays;

public class MyExample1 implements Comparable<MyExample1>{
	private String nameItem;
	private double priceItem;
	
	
	public MyExample1(String nameItem, double priceItem) {
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
	public int compareTo(MyExample1 anotherOne) {
		
		if(this.priceItem<anotherOne.priceItem) {
			return -1;
		}else if(this.priceItem>anotherOne.priceItem) {
			return 1;
		}
		return 0;
	}
	
	
	
	
	
	

}
