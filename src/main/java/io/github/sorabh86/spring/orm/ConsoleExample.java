/*
 *  All rights reserved to @sorabh86 <ssorabh.ssharma@gmail.com>
 */
package io.github.sorabh86.spring.orm;

import io.github.sorabh86.spring.orm.dao.StudentDao;
import io.github.sorabh86.spring.orm.entities.Student;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author sorabh
 */
public class ConsoleExample {
    private static BufferedReader bufferReader;
    private static StudentDao studentDao;
    
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ormconfig.xml");
        studentDao = context.getBean("studentDao", StudentDao.class);
        
        bufferReader = new BufferedReader(new InputStreamReader(System.in));
        boolean go = true;
        
        while(go) {
            System.out.println("******************** Welcome to spring ORM *********************\n");
            System.out.println("PRESS 1 for add new student");
            System.out.println("PRESS 2 for display all students");
            System.out.println("PRESS 3 for get details of student");
            System.out.println("PRESS 4 for delete student");
            System.out.println("PRESS 5 for update student");
            System.out.println("PRESS 0 for exit");
            
            try {
               int input = Integer.parseInt(bufferReader.readLine());
               
                switch (input) {
                    case 1:
                        addStudent();
                        break;
                    case 2:
                        System.out.println("get all students");
                        getAllStudent();
                        break;
                    case 3:
                        System.out.println("get student details");
                        getStudent();
                        break;
                    case 4:
                        System.out.println("Student is deleted");
                        deleteStudent();
                        break;
                    case 5:
                        updateStudent();
                        break;
                    case 0:
                        go = false;
                        System.out.println("******************** Exiting to spring ORM *********************");
                        break;
                }
            } catch(Exception e) {
                System.out.println("Invalid Input try again!!");
                System.out.println(e.getMessage());
            }
        }        
    }
    
    public static void addStudent() throws IOException {
        System.out.println("Add New Student::");
        
        Student student = new Student();
        System.out.println("Enter id:");
        student.setId(Integer.parseInt(bufferReader.readLine()));
        System.out.println("Enter name:");
        student.setName(bufferReader.readLine());
        System.out.println("Enter course:");
        student.setCourse(bufferReader.readLine());

        System.out.println(student.toString());
        studentDao.insert(student);
    }
    public static void updateStudent() throws IOException{
        System.out.println("Update Student details::");
        
        Student student = new Student();
        System.out.println("Enter id:");
        student.setId(Integer.parseInt(bufferReader.readLine()));
        System.out.println("Enter name:");
        student.setName(bufferReader.readLine());
        System.out.println("Enter course:");
        student.setCourse(bufferReader.readLine());
        
        studentDao.updateStudent(student);
    }
    public static void deleteStudent() throws IOException{
        System.out.println("Delete Student::");
        
        System.out.println("Enter id:");
        int studentId = Integer.parseInt(bufferReader.readLine());
        studentDao.deleteStudent(studentId);
        System.out.println("Student Deleted!!!");
    }
    public static void getStudent() throws IOException{
        System.out.println("Get Student::");
        
        System.out.println("Enter id:");
        int studentId = Integer.parseInt(bufferReader.readLine());
        System.out.println(studentDao.getStudent(studentId));
    }
    public static void getAllStudent() throws IOException{
        System.out.println("Get All Students::");
        List<Student> students = studentDao.getAllStudent();
        for(Student s:students)
            System.out.println(s);
    }
    
}
