package com.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.beans.Coffee;
import com.demo.beans.CoffeeShop;
import com.demo.config.ProjectConfig;


public class Main
{
	private Main()
	{
	}

	static void main()
	{
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		var coffeeShop = context.getBean(CoffeeShop.class);
		Coffee coffee = coffeeShop.getCoffee();
		System.out.println(coffee.makeCoffee());
	}
}
