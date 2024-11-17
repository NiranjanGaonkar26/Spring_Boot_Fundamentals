package com.Niranjan.SpringBootDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component         //Spring only creates and manages the beans of classes which have been annotated with Component
public class Demo {

    @Autowired       //Automatically wires beans together. i.e, searches for the matching type bean from the container.
    Laptop laptop;

    public void code(){
        laptop.compile();
    }
}
