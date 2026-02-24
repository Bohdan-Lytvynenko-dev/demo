package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.demo.beans.Person;
import com.demo.beans.Vehicle;


/*
Spring @Configuration annotation is part of the spring core framework.
Spring Configuration annotation indicates that the class has @Bean definition
methods. So Spring container can process the class and generate Spring Beans
to be used in the application.
 */
@Configuration
@ComponentScan(basePackages = { "com.demo.beans" })
public class ProjectConfig
{

	@Bean
	Vehicle vehicle()
	{
		Vehicle vehicle = new Vehicle();
		vehicle.setName("Toyota");
		return vehicle;
	}

    /*@Bean
    Person person() {
        Person person = new Person();
        person.setName("Lucy");
        person.setVehicle(vehicle());
        return person;
    }*/

	@Bean
	Person person(Vehicle vehicle)
	{
		Person person = new Person();
		person.setName("Lucy");
		person.setVehicle(vehicle);
		return person;
	}
}
