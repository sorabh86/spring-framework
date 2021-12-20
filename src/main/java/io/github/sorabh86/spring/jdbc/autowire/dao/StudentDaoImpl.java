/*
 *  All rights reserved to @sorabh86 <ssorabh.ssharma@gmail.com>
 */
package io.github.sorabh86.spring.jdbc.autowire.dao;

import io.github.sorabh86.spring.jdbc.dao.*;
import io.github.sorabh86.spring.jdbc.entity.Student;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 *
 * @author sorabh
 */
@Component("studentDao")
public class StudentDaoImpl implements StudentDao {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Student student) {
        String query = "INSERT INTO student(id, name) VALUES(?,?)";
        return this.jdbcTemplate.update(query, student.getId(), student.getName());
    }

    @Override
    public int update(Student student) {
        String q = "UPDATE student SET username=?, password=? WHERE id=?";
        return this.jdbcTemplate.update(q, student.getUsername(), student.getPassword(), student.getId());
    }

    @Override
    public int delete(int studentId) {
        String q = "DELETE FROM student WHERE id=?";
        return this.jdbcTemplate.update(q, studentId);
    }

    @Override
    public Student getStudent(int studentId) {
        String q = "SELECT * FROM student WHERE id=?";
        return this.jdbcTemplate.queryForObject(q, new RowMapperImpl(), studentId);
    }

    @Override
    public List<Student> getAllStudents() {
        String query = "SELECT * FROM student";
        return this.jdbcTemplate.query(query, new RowMapperImpl());
    }
    
    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
