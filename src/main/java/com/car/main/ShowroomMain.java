package com.car.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.car.Car;
import com.car.ShowRoom;

public class ShowroomMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("cars.xml");
		
		Car honda=(Car)applicationContext.getBean("honda");
		Car audi=(Car)applicationContext.getBean("audi");
		System.out.println("honda = "+honda);
		System.out.println("audi = "+audi);
		ShowRoom showroom=(ShowRoom)applicationContext.getBean("showroom");
		System.out.println(showroom);
	}
}
