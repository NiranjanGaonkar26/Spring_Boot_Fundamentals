package com.example.SpringJDBCex.service;

import com.example.SpringJDBCex.model.Student;
import com.example.SpringJDBCex.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    StudentRepo stdRepo;

    public StudentRepo getStdRepo() {
        return stdRepo;
    }

    @Autowired
    public void setStdRepo(StudentRepo stdRepo) {
        this.stdRepo = stdRepo;
    }

    public void addStudent(Student s){
        stdRepo.save(s);                    // Any DB related operations will be handled by a Repository class, in this example the Repository class is StudentRepo.java
    }

    public List<Student> getStudents() {
        return stdRepo.findAll();
    }
}
