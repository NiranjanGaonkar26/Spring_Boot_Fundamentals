package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);         //Using java based approach to interact with the container. AppConfig is the name of the java class where we write the configuration. It is similar to the spring.xml file

        //Desktop dt = context.getBean(Desktop.class);          Getting the bean by type

//        Desktop dt = context.getBean("des1", Desktop.class);       //Getting the bean by name
//        dt.compile();

//        Laptop lp1 = context.getBean("lap", Laptop.class);
//
//        Laptop lp2 = context.getBean("lap", Laptop.class);

        Alien al = context.getBean(Alien.class);
        System.out.println(al.getAge());
        al.code();

    }
}
