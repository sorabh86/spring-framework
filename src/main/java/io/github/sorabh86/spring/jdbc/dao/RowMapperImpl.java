/*
 *  All rights reserved to @sorabh86 <ssorabh.ssharma@gmail.com>
 */
package io.github.sorabh86.spring.jdbc.dao;

import io.github.sorabh86.spring.jdbc.entity.Student;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author sorabh
 */
public class RowMapperImpl implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setId(rs.getInt(1));
        student.setName(rs.getString(2));
        student.setUsername(rs.getString(3));
        student.setPassword(rs.getString(4));
        return student;
    }
    
}
