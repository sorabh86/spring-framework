[< back](../../../../../../../../)

# Spring JDBC
------------------------
It is a module of Spring Framework which extends Java JDBC to provide enhancement in features.
We use org.springframework.jdbc.core.JdbcTemplate:
1. JdbcTemplate required property dataSource=org.springframework.jdbc.datasource.DriverManagerDataSource, 
And DriverManagerDataSource required properties:
1. driverClassName : It is like mysql, mongo, oracle full class path to Driver.
2. url : url pattern <domain>:<sub-domain>://<host>:<port>/<databasename>
3. username : username of database
4. password : password of database

# Spring JDBC with XML configuration
---------------------
Spring JDBC is a powerful mechanism to connect to the database and execute SQL queries.
Spring JDBC provide class JdbcTemplate which has all the important methods to perform operation with database.

# Required dependency in POM
----------------------
```xml
<dependencies>
    <!-- https://mvnrepository.com/artifact/org.springframework/spring-core -->
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-core</artifactId>
      <version>5.3.9</version>
    </dependency>
    <!-- https://mvnrepository.com/artifact/org.springframework/spring-context -->
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-context</artifactId>
      <version>5.3.9</version>
    </dependency>
    <!-- https://mvnrepository.com/artifact/org.springframework/spring-jdbc -->
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-jdbc</artifactId>
        <version>5.3.9</version>
    </dependency>
    <!-- I am using MySQL Database Version 8.0.13, connector version must be same -->
    <!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <version>8.0.13</version>
    </dependency>
</dependencies>
```
