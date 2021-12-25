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
public interface StudentDao {

   public int insert(Student student);
   public Student getStudent(int studentId);
   public List<Student> getAllStudent();
   public void deleteStudent(int studentId);
   public void updateStudent(Student student);
    
}
