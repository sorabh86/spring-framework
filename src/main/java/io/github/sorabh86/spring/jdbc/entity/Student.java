
package io.github.sorabh86.spring.jdbc.entity;

/**
 *
 * @author sorabh
 */
public class Student {
    private int id;
    private String name;
    private String username;
    private String password;

    public Student(int id, String name, String username, String password) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
    }
    
    public Student() {}

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + '}';
    }
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
    
}
