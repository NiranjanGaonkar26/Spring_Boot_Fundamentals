package com.Niranjan.SpringBootDemo;

import com.Niranjan.SpringBootDemo.model.Demo;
import com.Niranjan.SpringBootDemo.model.Laptop;
import com.Niranjan.SpringBootDemo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication 		// Does several things - 1. Marks the main class(the class with the main()) of the Spring boot application. 2. Indicates that the class is a Spring configuration class(i.e, similar to @Configuration). 3. Does the work of @ComponentScan - i.e, tells Spring to scan the current package and it's subpackages for Components, Services, and Configurations
public class SpringBootDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);    //Activates the spring framework. Also runs the IoC Container which contains the Spring beans(aka any object created and managed by Spring)

		LaptopService service = context.getBean(LaptopService.class);

		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);

//		Demo obj = context.getBean(Demo.class);
//		System.out.println(obj.getAge());
//		obj.code();
	}
}
