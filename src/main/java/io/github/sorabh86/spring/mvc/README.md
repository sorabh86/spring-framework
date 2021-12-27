[< back](../../../../../../../../../../)

# Spring MVC (web)
It is a module of Spring Framework which is used to to build a web application. It is build on top of Servlet API. MVC stands for Model-View-Controller.

### New project by archetype
`org.apache.maven -> maven-archetype-webapps`
### Spring dependency
```xml
<!-- https://mvnrepository.com/artifact/org.springframework/spring-webmvc -->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-webmvc</artifactId>
    <version>5.3.9</version>
</dependency>
```
### Configuration
1. Configure the dispatcher servlet in web.xml
```xml
<!DOCTYPE web-app PUBLIC
 "-//Sun Microsystems, Inc.//DTD Web Application 2.3//EN"
 "http://java.sun.com/dtd/web-app_2_3.dtd" >

<web-app>
    <display-name>Sorabh86</display-name>

    <!-- Configure dispatcher servlet -->
    <servlet>
        <servlet-name>spring-mvc</servlet-name>
        <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>spring-mvc</servlet-name>
        <url-pattern>/</url-pattern>
    </servlet-mapping>

</web-app>
```
2. Create Spring Configuration file, new xml file with same name `<servlet-name>-servlet.xml` in same folder (for auto-configuration).
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xmlns:p="http://www.springframework.org/schema/p"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
       http://www.springframework.org/schema/context/spring-context.xsd">
    

</beans>
```
3. Configure View Resolver (spring-mvc-servlet.xml)
```xml
<!-- enable anootation based Configuration -->
<context:component-scan base-package="io.github.sorabh86.spring.mvc" />

<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver" name="viewResolver">
    <property name="prefix" value="/WEB-INF/views/" />
    <property name="suffix" value=".jsp" />
</bean>
```
4. Create Controller
```java
package io.github.sorabh86.spring.mvc;
@Controller
public class SiteController {
    @RequestMapping("/")
    public String name() {
        return "index";
    }
}
```
5. Create View, index.jsp file
```html
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1" />
        <title>Home</title>
    </head>
    <body>
        <h1>Hello World</h1>
    </body>
</html>
```

## Sending data from controller to view
1. Model Approach
```
// Controller (SiteController.java)
import org.springframework.ui.Model;
@Controller
public class SiteController {
    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "Sorabh");
        return "index";
    }
}
// View (index.jsp)
<h1><%= request.getAttribute("name"); %></h1>
```
2. ModelAndView Approach
```
// Controller (SiteController.java)
import org.springframework.web.servlet.ModelAndView
@Controller
public class SiteController {
    @RequestMapping("/")
    public ModelAndView contact() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("name", "Sorabh");
        mav.setViewName("contact");
        return mav;
    }
}
// View (contact.jsp)
<h1><%= request.getAttribute("name"); %></h1>
```

### JSP Expression Lanugage
```
// View (contact.jsp)
// add a page directive
<%@page isELIgnored="false" %>
// You can access same mention above using JSP Expression Language
// primitive value
<h1>${name}</h1>
```
// printing collection value inside view, you can use JSTL
// add dependencies in pom.xml
```
<!-- https://mvnrepository.com/artifact/javax.servlet.jsp.jstl/jstl -->
<dependency>
    <groupId>javax.servlet.jsp.jstl</groupId>
    <artifactId>jstl</artifactId>
    <version>1.2</version>
</dependency>
<h1></h1>

// View (contact.jsp)
// add taglib directive on the top of view
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach var="student" items="students">
    <h1>${student}</h1>
    <c:out value="${student}" />
</c:forEach>
```

## Sending Data from View to Controller
1. Using @RequestParam directive
```
@Controller
public class SiteController {
    @RequestMapping(path="/myform", method="RequestMethod.GET")
    public String myForm() {
        return "myform";
    }
    @RequestMapping(path="/submitform", method="RequestMethod.POST")
    public ViewAndModel submitForm(
            @RequestParam(name="email", required="false") String email, // by default required is true 
            @RequestParam("message") String message) {
        // Old servlet code for accessing parameters
        // public String submitForm(HttpServletRequest request) {
        //    String email = request.getParameter("email");
        
        // New using @RequestParam
        ViewAndModel vam = new ViewAndModel();
        vam.addObject("email", email);
        vm.addObject("message", message);
        vm.setViewName("submitform");

        return vam;
    }
}

// myform.jsp
<form action="/submitForm" method="POST">
    <label for="email">Email: <input type="text" name="email" /></label>
    <label for="message">Message: <textarea name="message"></textarea></label>
    <button type="submit">Submit Form</button>
</form>

// submitform.jsp
<%page isELIgnored="false" %>
<h1>Details Submitted</h1>
<p>Email: ${email}</p>
<p>Message: ${message}</p>
```
2. Using @ModelAttribute directive on param
```
// Model class
@GenerateGetterSetter
@GenerateToString
public class UserInquery {
    private String name;
    private String message;
}

// Controller
public class SiteController {
    @RequestMapping(path="/submitform", method="RequestMethod.POST")
    public String submitForm(@ModelAttribute UserInquery userInquery, Model model) {
        return "submitform";
    }
}

// View
<%page isELIgnored="false" %>
<h1>Details Submitted</h1>
<p>Email: ${userInquery.email}</p>
<p>Message: ${userInquery.message}</p>
```
3. Using @ModelAttribute directive on method. It will run on calling of every @RequestMapping method in that class
```
// Controller
public void autoInjectToModel(Model model) {
    model.addAttribute("key", "value");
}
```



