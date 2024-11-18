package com.Niranjan.SpringBootDemo.service;

import com.Niranjan.SpringBootDemo.model.Laptop;
import com.Niranjan.SpringBootDemo.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service        //Similar to what @Component does
public class LaptopService {

    @Autowired
    private LaptopRepository repo;

    public void addLaptop(Laptop lap) {
        repo.save(lap);
    }

    public boolean isGoodLaptop(Laptop lap){
        return true;
    }
}
