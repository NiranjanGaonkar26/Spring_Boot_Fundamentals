package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component          // This is an annotation which tells Spring to automatically create and manage the beans of this type. We don't need to explicitly write bean creation code in the AppConfig
//@Scope("prototype")

public class Alien {
    public Alien(){
        System.out.println("Alien Constructor invoked");
    }

    @Value("21")
    private int age;

//    @Autowired
//    @Qualifier("desktop")                         // This is field injection - NOT PREFERRED
    private Computer com;

//    public Alien(int age, Computer com) {
//        this.age = age;
//        this.com = com;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    @Autowired                                  // Search for the required bean as specified by the qualifier in the container and inject it to the com attribute
    @Qualifier("lappy")                         // When using the Qualifier wrt the @Component beans, the default name of the bean in the Container is the name of the class but in lower case
    public void setCom(Computer com) {          // This is setter injection - PREFERRED way for Autowired
        this.com = com;
    }

    public void code(){
        com.compile();
        System.out.println("Coding..");
    }
}
