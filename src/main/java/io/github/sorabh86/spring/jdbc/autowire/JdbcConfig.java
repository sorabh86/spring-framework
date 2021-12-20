/*
 *  All rights reserved to @sorabh86 <ssorabh.ssharma@gmail.com>
 */
package io.github.sorabh86.spring.jdbc.autowire;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author sorabh
 */
@Configuration
@ComponentScan(basePackages = {"io.github.sorabh86.spring.jdbc.autowire"})
public class JdbcConfig {
    
    @Bean("dataSource")
    public DriverManagerDataSource getDataSource() {
        DriverManagerDataSource ds= new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/spring_jdbc?useSSL=false");
        ds.setUsername("root");
        ds.setPassword("root");
        return ds;
    }
    
    @Bean("jdbcTemplate")
    public JdbcTemplate getTemplate() {
        JdbcTemplate jt = new JdbcTemplate();
        jt.setDataSource(getDataSource());
        return jt;
    }
    
    
}
