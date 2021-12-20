[< back](../../../../../../../../../../)

# Core Container
spring-core & spring-beans modules provide the fundamental parts of the framework, including the IoC and Dependency Injection features.
The BeanFactory is a sophistical implementation of factory pattern, It removes need for programmatic singletons and allows you to decouple the configuration and specification of dependencies from your actual program logic.


## Modules
- spring-core
- spring-beans
- spring-context
- spring-context-support
- spring-expression

## Bill of Materials
It is possible to accidentally mix different versions of Spring JARs when using Maven, To overcome such problems Maven supports the concept of a "bill of materials" (BOM) dependency.
Benefit of using the BOM is that you no longer need to specify the <version> attribute when depending on Spring Framework artifacts.
### Maven
```xml
<dependencyManagement>
    <dependencies>
        <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-framework-bom</artifactId>
        <version>5.0.0.M1</version>
        <type>pom</type>
        <scope>import</scope>
        </dependency>
    </dependencies>
</dependencyManagement>

<dependencies>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-web</artifactId>
    </dependency>
<dependencies>
```
### Gradle



