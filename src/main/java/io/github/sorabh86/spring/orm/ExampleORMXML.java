/*
 *  All rights reserved to @sorabh86 <ssorabh.ssharma@gmail.com>
 */
package io.github.sorabh86.spring.orm;

import io.github.sorabh86.spring.orm.dao.StudentDao;
import io.github.sorabh86.spring.orm.dao.StudentDaoImpl;
import io.github.sorabh86.spring.orm.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author sorabh
 */
public class ExampleORMXML {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ormconfig.xml");
        StudentDao sBean = context.getBean("studentDao", StudentDaoImpl.class);
        
        Student student = new Student(234, "Sorabh Sharma", "MCA");
        System.out.println("Affected: "+sBean.insert(student));
    }
}
