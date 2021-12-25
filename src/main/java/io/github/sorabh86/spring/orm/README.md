# Spring ORM
ORM means Object Relational Mapping

## Examples
- Hibernate (HibernateTemplate), Methods:Save, Update, Insert, Get, loadAll
    HibernateTemplate -> SessionFactory(Interface) <- LocalSessionFactoryBean(DataSource(url, username, password))
    - Database Properties (DataSource)
        - url
        - username
        - password
    - Hibernate Properties
        - dialect
        - SoSQL
        - FormatSQL
    - Annotated Classes
- Toplink
- iBATIS

## ORM Configuration
pom.xml
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
    <!-- https://mvnrepository.com/artifact/org.springframework/spring-orm -->
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-orm</artifactId>
        <version>5.3.9</version>
    </dependency>
    <!-- https://mvnrepository.com/artifact/org.hibernate/hibernate-core -->
    <dependency>
        <groupId>org.hibernate</groupId>
        <artifactId>hibernate-core</artifactId>
        <version>5.4.16.Final</version>
    </dependency>

    <!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <version>8.0.13</version>
    </dependency>
</dependencies>
```