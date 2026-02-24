package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;

import com.demo.beans.Vehicle;


/*
Spring @Configuration annotation is part of the spring core framework.
Spring Configuration annotation indicates that the class has @Bean definition
methods. So Spring container can process the class and generate Spring Beans
to be used in the application.
 */
@Configuration
@Import({ AnotherProjectConfig.class })
public class ProjectConfig
{

	@Bean(name = "audiVehicle")
	Vehicle vehicle1()
	{
		var veh = new Vehicle();
		veh.setName("Audi");
		return veh;
	}

	@Primary
	@Bean(value = "hondaVehicle")
	Vehicle vehicle2()
	{
		var veh = new Vehicle();
		veh.setName("Honda");
		return veh;
	}

	@Bean({ "ferrariVehicle", "myFavouriteVehicle" })
	@Description("This is a Vehicle class bean")
	Vehicle vehicle3()
	{
		var veh = new Vehicle();
		veh.setName("Ferrari");
		return veh;
	}

}
