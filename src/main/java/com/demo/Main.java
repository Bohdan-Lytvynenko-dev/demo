package com.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.beans.Bike;
import com.demo.beans.Engine;
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

		if (context.containsBean("engine"))
		{
			Engine engine = context.getBean(Engine.class);
			System.out.println("Engine name = " + engine.getName());
		}
		if (context.containsBean("vehicle"))
		{
			Vehicle v = context.getBean(Vehicle.class);
			System.out.println("Vehicle name = " + v.getName());
			System.out.println("Vehicle engine = " + v.getEngine());
		}
		if (context.containsBean("bike"))
		{
			Bike b = context.getBean(Bike.class);
			System.out.println("Bike model = " + b.getName());
		}
	}
}
