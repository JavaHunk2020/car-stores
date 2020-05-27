package com.car;

public class Car {
	private int cid;
	private String model;
	private String color;
	private int price;
	
	
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public Car() {
		System.out.println(")#)#)Cons Car");
	}
	
	public void run() {
		System.out.println("This car runs fine!!!!!!!!!!!!!!!!!!!!");
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", price=" + price + "]";
	}

}
