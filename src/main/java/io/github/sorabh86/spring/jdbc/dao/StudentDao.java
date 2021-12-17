/*
 *  All rights reserved to @sorabh86 <ssorabh.ssharma@gmail.com>
 */
package io.github.sorabh86.spring.jdbc.dao;

import io.github.sorabh86.spring.jdbc.entity.Student;
import java.util.List;

/**
 *
 * @author sorabh
 */
public interface StudentDao {
    public int insert(Student student);
    public int update(Student student);
    public int delete(int studentId);
    public Student getStudent(int studentId);
    public List<Student> getStudents();
}
