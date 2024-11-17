package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
//        Alien obj = new Alien();
//        obj.code();

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); //XML way of asking Spring to create the container and one object per bean tag mentioned in the xml tag
        Alien obj = (Alien) context.getBean("alien");           // alien inside the getBean() is the id of the bean(i.e, object) which is being referenced here
        System.out.println(obj.getAge());
        obj.code();

        System.out.println();

        Alien obj1 = (Alien) context.getBean("alien1");
        System.out.println(obj1.getAge());
        obj1.code();

    }
}
