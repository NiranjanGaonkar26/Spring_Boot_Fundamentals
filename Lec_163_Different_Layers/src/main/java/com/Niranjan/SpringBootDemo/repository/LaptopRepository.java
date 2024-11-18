package com.Niranjan.SpringBootDemo.repository;

import com.Niranjan.SpringBootDemo.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository         //Similar to what @Component does
public class LaptopRepository {
    // This is a class which is responsible to connect with the DB and interact with the DB(i.e, perform CRUD operations))
    public void save(Laptop lap){
        System.out.println("Saved to the DB....");
    }
}
