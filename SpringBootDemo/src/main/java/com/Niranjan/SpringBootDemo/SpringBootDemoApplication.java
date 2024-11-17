package com.Niranjan.SpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);    //Activates the spring framework. Also runs the IoC Container which contains the Spring beans(aka any object created and managed by Spring)
		System.out.println("Hello World");

		//Demo dobj = new Demo();           Usual way of creating objects. But we want to use the bean created by the Spring framework.
		//dobj.code();

		// In order to inject the beans(i.e objects) from the IoC container into the project, you need to use the ApplicationContext object
		Demo obj = context.getBean(Demo.class);
		obj.code();
	}

}
