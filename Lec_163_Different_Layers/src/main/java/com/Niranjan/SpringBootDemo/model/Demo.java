package com.Niranjan.SpringBootDemo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component         //Spring only creates and manages the beans of classes which have been annotated with Component
public class Demo {

    @Value("25")        //This annotation is used inject default value into a property of a Spring Bean
    private int age;
    private Computer com;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    @Autowired       //Automatically wires beans together. i.e, searches for the matching type bean from the container.
    @Qualifier("laptop")
    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        com.compile();
    }
}
