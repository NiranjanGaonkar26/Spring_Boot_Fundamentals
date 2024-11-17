package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer{
    public Desktop(){
        System.out.println("Desktop's constructor");
    }

    @Override
    public void compile() {
        System.out.println("Compile method invoked from Desktop");
    }
}
