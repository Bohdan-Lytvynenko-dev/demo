package com.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.beans.Car;
import com.demo.beans.Engine;
import com.demo.beans.Person;
import com.demo.beans.Vehicle;
import com.demo.config.ProjectConfig;


public class Main
{
	private Main()
	{
	}

	static void main()
	{
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		var person = context.getBean(Person.class);
		var vehicle = context.getBean(Vehicle.class);
		System.out.println("Person name from Spring Context is: " + person.getName());
		System.out.println("Vehicle name from Spring Context is: " + vehicle.getName());
		System.out.println("Vehicle that Person own is: " + person.getVehicle());

		var car = context.getBean(Car.class);
		var engine = context.getBean(Engine.class);
		System.out.println("Car name from Spring Context is: " + car.getName());
		System.out.println("Engine name from Spring Context is: " + engine.getName());
		System.out.println("Engine that Car own is: " + car.getEngine());
	}
}
