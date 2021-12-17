package io.github.sorabh86.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author sorabh
 */
public class Test {
    public static void main(String[] args) {
        
        ApplicationContext c = new ClassPathXmlApplicationContext("jdbc-config.xml");

        // Get JdbcTemplate
        JdbcTemplate jdbcTemp = c.getBean("jdbcTemplate", JdbcTemplate.class);
        jdbcTemp.update("INSERT into student(id,name) VALUES(?,?)", 1, "Sorabh");
        
    }
}
