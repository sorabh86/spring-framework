/*
 *  All rights reserved to @sorabh86 <ssorabh.ssharma@gmail.com>
 */
package io.github.sorabh86.spring.jdbc;

import io.github.sorabh86.spring.jdbc.withoutxmlconfig.JdbcConfig;
import io.github.sorabh86.spring.jdbc.dao.StudentDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author sorabh
 */
public class WithoutXMLConfigurationExample {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(JdbcConfig.class);
        
        StudentDao studentDao = ctx.getBean("studentDao", StudentDao.class);
        
        // INSERT COLUMN
//        Student student = new Student();
//        student.setId(7);
//        student.setName("Vivek Hooda");
//        int result = studentDao.insert(student);
//        System.out.println("Inserted: "+result);
        
        // UPDATE COLUMN
//        Student student = new Student();
//        student.setId(4);
//        student.setUsername("manoj.yadav123");
//        student.setPassword("123ManojYadav123");
//        int result = studentDao.update(student);
//        System.out.println("Inserted: "+result);

        // DELETE COLUMN
//        int result = studentDao.delete(127);
//        System.out.println("Inserted: "+result);
        
        // SELECT COLUMN
//        System.out.println("Row 123: "+ studentDao.getStudent(123));

        // SELECT ALL COLUMN
        System.out.println("All Students:"+ studentDao.getAllStudents());
    }
}
