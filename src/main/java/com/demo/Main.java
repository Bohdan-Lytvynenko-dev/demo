package com.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.beans.Vehicle;
import com.demo.config.ProjectConfig;


public class Main
{
	static void main()
	{

		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		var veh = context.getBean("audiVehicle", Vehicle.class);
		System.out.println("Vehicle name from Spring Context is: " + veh.getName());

		var vehicle = (Vehicle) context.getBean("myFavouriteVehicle");
		System.out.println("Vehicle name from Spring Context is: " + vehicle.getName());

		var vhcle = context.getBean(Vehicle.class);
		System.out.println("Vehicle name from Spring Context is: " + vhcle.getName());

		var helloWorld = context.getBean(String.class);
		System.out.println("String value from Spring Context is: " + helloWorld);
	}
}
