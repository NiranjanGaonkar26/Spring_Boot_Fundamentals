package org.example;

import org.springframework.stereotype.Component;

@Component("lappy")
public class Laptop implements Computer {
    public Laptop(){
        System.out.println("Laptop's constructor");
    }

    @Override
    public void compile(){
        System.out.println("Compile method invoked from Laptop");
    }
}
