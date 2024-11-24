// Initially the datasource for this repository is the h2 db which is an in memory database. A dependency has been added for it. Since h2 is an embedded db, spring knows where h2 is and how to connect with it.
// The queries for schema definitions - must be present in resources/schema.sql
// The queries for insert operations (to load initial data) - must be present in resources/data.sql


package com.example.SpringJDBCex.repository;

import com.example.SpringJDBCex.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbc;                  //JdbcTemplate a core class in Spring Framework which simplifies database interactions and helps manage jdbc operations. Main goal - reduce boilerplate code and handle common tasks, such as opening and closing connections, error handling, and managing SQL exceptions.

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student s) {
        String sql = "insert into student (rollno, name, marks) values (?,?,?)";

        int rows = jdbc.update(sql, s.getRollNo(), s.getName(), s.getMarks());
        System.out.println(rows + " rows effected");
    }

    public List<Student> findAll(){
        String sql = "select * from student";

        RowMapper<Student> mapper = new RowMapper<Student>() {                                  //RowMapper is an interface in Spring's JDBC module used to map rows of a ResultSet to Java objects. It is a key part of working with JdbcTemplate to convert the data retrieved from a database query into domain objects. This makes it easier to work with the data in your Java application, since you can directly deal with objects rather than the raw database result set.
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {               // RowMapper interface has a single method. rs is the ResultSet that contains the data retrieved from the database.

                Student s = new Student();                                                      // Overall working of mapRow() - for each row in the ResultSet which will contain all the rows fetched when jdbc.query() is executed,
                s.setRollNo(rs.getInt("rollno"));                                    //                               convert it into an object of corresponding type and return it.
                s.setName(rs.getString("name"));
                s.setMarks(rs.getInt("marks"));
                return s;                                                                   // The method should return an instance of the type T that represents a row in the ResultSet, converted into a domain object.
            }
        };

        return jdbc.query(sql, mapper);                                                         // Execute the query and store the fetched rows in the ResultSet argument of the mapRow() method of the RowMapper reference variable. JdbcTemplate.query() returns the list of all objects(i.e, corresponding to all rows)
    }
}
