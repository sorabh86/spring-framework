/*
 *  All rights reserved to @sorabh86 <ssorabh.ssharma@gmail.com>
 */
package io.github.sorabh86.spring.jdbc.dao;

import io.github.sorabh86.spring.jdbc.entity.Student;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author sorabh
 */
public class StudentDaoImpl implements StudentDao {
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Student student) {
        String query = "INSERT INTO student(id, name) VALUES(?,?)";
        return this.jdbcTemplate.update(query, student.getId(), student.getName());
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int update(Student student) {
        String q = "UPDATE student SET name=? WHERE id=?";
        return this.jdbcTemplate.update(q, student.getName(), student.getId());
    }

    @Override
    public int delete(int studentId) {
        String q = "DELETE student WHERE id=?";
        return this.jdbcTemplate.update(q, studentId);
    }

    @Override
    public Student getStudent(int studentId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Student> getStudents() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
