package com.car.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.car.Car;

public class CarSpringMain {

	public static void main(String[] args) {
		
		//Create spring container and reading cars.xml and creating two instance of car
		//inside spring container
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("cars.xml");
		Car honda=(Car)applicationContext.getBean("honda");
		System.out.println(honda);
		honda.run();
		
		Car audi=(Car)applicationContext.getBean("audi");
		System.out.println(audi);
		audi.run();
		
		
	}
}
