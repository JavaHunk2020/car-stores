package com.car;

public class ShowRoom {
	
	private String name;
	private String address;
	private Car car;
	
	public ShowRoom() {
		System.out.println("@##ShowRoom(#(");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "ShowRoom [name=" + name + ", address=" + address + ", car=" + car + "]";
	}

}
