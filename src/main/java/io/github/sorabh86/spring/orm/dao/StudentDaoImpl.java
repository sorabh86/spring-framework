/*
 *  All rights reserved to @sorabh86 <ssorabh.ssharma@gmail.com>
 */
package io.github.sorabh86.spring.orm.dao;

import io.github.sorabh86.spring.orm.entities.Student;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.orm.hibernate5.HibernateTemplate;

/**
 *
 * @author sorabh
 */
public class StudentDaoImpl implements StudentDao{
    private HibernateTemplate hibernateTemplate;
    
    @Transactional
    @Override
    public int insert(Student student) {
        return (int)this.hibernateTemplate.save(student);
    }
    
    @Override
    public Student getStudent(int studentId) {
        Student student = this.hibernateTemplate.get(Student.class, studentId);
        return student;
    }
    @Override
    public List<Student> getAllStudent() {
        return this.hibernateTemplate.loadAll(Student.class);
    }
    @Override
    public void deleteStudent(int studentId) {
        Student s = this.hibernateTemplate.get(Student.class, studentId);
        this.hibernateTemplate.delete(s);
    }
    
    @Transactional
    @Override
    public void updateStudent(Student student) {
        this.hibernateTemplate.update(student);
    }
   
    
    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
