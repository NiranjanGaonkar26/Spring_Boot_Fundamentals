package com.Niranjan.SpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication 		// Does several things - 1. Marks the main class(the class with the main()) of the Spring boot application. 2. Indicates that the class is a Spring configuration class(i.e, similar to @Configuration). 3. Does the work of @ComponentScan - i.e, tells Spring to scan the current package and it's subpackages for Components, Services, and Configurations
public class SpringBootDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);    //Activates the spring framework. Also runs the IoC Container which contains the Spring beans(aka any object created and managed by Spring)


		//Demo dobj = new Demo();           Usual way of creating objects. But we want to use the bean created by the Spring framework.
		//dobj.code();

		// In order to inject the beans(i.e objects) from the IoC container into the project, you need to use the ApplicationContext object
		Demo obj = context.getBean(Demo.class);
		System.out.println(obj.getAge());
		obj.code();
	}
}
