package io.github.sorabh86.spring.jdbc;

import io.github.sorabh86.spring.jdbc.dao.StudentDao;
import io.github.sorabh86.spring.jdbc.entity.Student;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author sorabh
 */
public class Example1 {
    private static JdbcTemplate jdbcTemp;
    
    public static void main(String[] args) {
        
        System.out.println("-------------Starting JDBC Test Program...---------------");
        
        ApplicationContext c = new ClassPathXmlApplicationContext("example1-jdbc-config.xml");
        StudentDao studentDao = c.getBean(StudentDao.class);
        Student student = new Student();
        student.setId(7);
        student.setName("Vivek Hooda");
        int result = studentDao.insert(student);
        System.out.println("Inserted: "+result);
        
        
    }
    
}
