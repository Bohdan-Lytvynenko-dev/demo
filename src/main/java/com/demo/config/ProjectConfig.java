package com.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


/*
Spring @Configuration annotation is part of the spring core framework.
Spring Configuration annotation indicates that the class has @Bean definition
methods. So Spring container can process the class and generate Spring Beans
to be used in the application.
 */
@Configuration
@Import({ MyBeanRegistrar.class })
public class ProjectConfig
{

}
