package com.example.SpringJDBCex;

import com.example.SpringJDBCex.model.Student;
import com.example.SpringJDBCex.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringJdbCexApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbCexApplication.class, args);

		Student s1 = context.getBean(Student.class);
		s1.setRollNo(4);
		s1.setName("abc");
		s1.setMarks(80);

		StudentService stdServ = context.getBean(StudentService.class);
		stdServ.addStudent(s1);

		List<Student> studentList = new ArrayList<>();
		studentList = stdServ.getStudents();
		System.out.println(studentList);
	}
}
