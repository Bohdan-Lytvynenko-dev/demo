package com.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.beans.Vehicle;
import com.demo.config.ProjectConfig;


public class Main
{
	static void main()
	{
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		var veh = context.getBean("vehicle1", Vehicle.class);
		System.out.println("Vehicle name from Spring Context is: " + veh.getName());

		var vehicle = (Vehicle) context.getBean("vehicle2");
		System.out.println("Vehicle name from Spring Context is: " + vehicle.getName());
	}
}
