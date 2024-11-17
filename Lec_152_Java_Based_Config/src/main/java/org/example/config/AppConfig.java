package org.example.config;

import org.example.Alien;
import org.example.Computer;
import org.example.Desktop;
import org.example.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration                          // If you want to configure your application using java-based configuration, then you should annotate your configuration class using this annotation. This marks a class as a source of bean definitions
@ComponentScan("org.example")           // Scan for classes in the mentioned package(s) with @Component annotation and automatically register them as beans in the application context
public class AppConfig {

//    @Bean
//    public Desktop desktop(){       //Methods within a class annotated with @Configuration can be annotated with @Bean. Such a method defines a bean, and Spring will manage its lifecycle.
//                                    // By default the name of the bean is the name of method in this case desktop
//        return new Desktop();       // Though it looks like we are manually creating and returning a bean, it is Spring which actually calls this method automatically and will manage the bean.
//    }
//
//    @Bean(name = "des1")            // Giving a name to the bean
//    @Primary
//    public Desktop desktop1(){
//        return new Desktop();
//    }
//
//    @Bean(name = "lap")
////    @Scope("prototype")             //Changes the scope to prototype
//    public Laptop laptop() {
//        return new Laptop();
//    }
//
//    @Bean
////    public Alien alien(@Qualifier("des1") Computer com){           //This is similar to ref="" from xml configuration.
//    public Alien alien(@Autowired Computer com){             //Searches for the Computer type bean from the container. The bean which is annotated as Primary will be selected in case of multiple beans of the same type
//        Alien obj = new Alien();
//        obj.setAge(25);
//        obj.setCom(com);
//        return obj;
//    }
}
