/*
 *  All rights reserved to @sorabh86 <ssorabh.ssharma@gmail.com>
 */
package io.github.sorabh86.spring.orm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author sorabh
 */
@Entity
@Table(name="student_details")
public class Student {
    @Id
    @Column(name="student_id")
    private int id;
    @Column(name="student_name")
    private String name;
    @Column(name="student_course")
    private String course;

    public Student() {
    }

    public Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", course=" + course + '}';
    }
}
