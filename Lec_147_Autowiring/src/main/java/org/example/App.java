package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj1 = (Alien) context.getBean("alien1");
        System.out.println(obj1.getAge());
        obj1.code();

        Desktop des = context.getBean("desk", Desktop.class);      //the usual getBean("Bean_name") will return a bean of type Object, therefore we had to type cast it.
                                                                         // Here we use a variant of getBean() that will directly return the bean of the type specified in the second argument
    }
}
