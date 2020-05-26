package com.car.main;

import com.car.Car;

public class CarMain {
	
	public static void main(String[] args) {
		Car honda=new Car();
		//who is creating instance of Car ???programmer
		honda.setColor("white");
		honda.setModel("2018");
		honda.setPrice(123);
		//who is setting attributes of Car ???programmer
		System.out.println(honda);
		honda.run();
		System.out.println("@)@)@Creating another instance of car!!!!!");
		honda=null; //Here your will die
		//who  is managing life of car = programmer
		
		Car audi=new Car();
		audi.setColor("red");
		audi.setModel("2020");
		audi.setPrice(34545);
		System.out.println(audi);
		audi.run();
		
	}

}
