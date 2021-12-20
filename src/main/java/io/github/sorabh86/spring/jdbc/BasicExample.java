package io.github.sorabh86.spring.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author sorabh
 */
public class BasicExample {
    private static JdbcTemplate jdbcTemp;
    
    public static void main(String[] args) {
        
        System.out.println("-------------Starting JDBC Test Program...---------------");
        
        ApplicationContext c = new ClassPathXmlApplicationContext("basic-example-jdbc-config.xml");

        // Get JdbcTemplate
        jdbcTemp = c.getBean("jdbcTemplate", JdbcTemplate.class);
        
        // Insert Single Object Operation
//        insertSingle(1, "Sorabh", "sorabh86", "123456");
        
        // Insert List
//        List<Map<String,Object>> list = new ArrayList<>();
//        
//        Map<String,Object> item1 = new HashMap<>();
//        item1.put("id", 123);
//        item1.put("name", "Jai Singh");
//        list.add(item1);
//        Map<String,Object> item2 = new HashMap<>();
//        item2.put("id", 124);
//        item2.put("name", "Aadarsh Kumar");
//        list.add(item2);
//        Map<String,Object> item3 = new HashMap<>();
//        item3.put("id", 125);
//        item3.put("name", "Gaurav Arya");
//        list.add(item3);
//        Map<String,Object> item4 = new HashMap<>();
//        item4.put("id", 126);
//        item4.put("name", "Neeraj Prasad");
//        list.add(item4);
//        Map<String,Object> item5 = new HashMap<>();
//        item5.put("id", 127);
//        item5.put("name", "Prathvi Rai");
//        list.add(item5);
//        System.out.println("list: "+list.toString());
//        
//        BasicTest.insertList(list);
        
        // Update
//        Map<String, Object> temItem = new HashMap<>();
//        temItem.put("name", new String("Sorabh Sharma"));
//        temItem.put("id", 1);
//        BasicTest.updateColumn(temItem);
        
        // Delete
//        BasicTest.deleteColumn(125);
        
        // Select all columns
        System.out.println("All Columns: " + BasicExample.selectAllColumn().toString());
        
        // Select column
        System.out.println("Columns id 1: " +BasicExample.selectColumn(1));
    }
    
    private static int insertColumn(int id, String name, String username, String password) {
        return jdbcTemp.update("INSERT into student(id,name) VALUES(?,?)", id, name, username, password);
    }
    
    private static int insertList(List<Map<String,Object>> list) {
        for(Map map:list) {
            jdbcTemp.update("INSERT into student(id,name) VALUES(?,?)", map.get("id"), map.get("name"));
        }
        return list.size();
    }
    
    private static int updateColumn(Map<String,Object> map) {
        return jdbcTemp.update("UPDATE student SET name=? WHERE id=?", map.get("name"), map.get("id"));
    }
    
    private static int deleteColumn(int id) {
        return jdbcTemp.update("DELETE FROM student WHERE id=?", id);
    }
    
    private static List<Map<String,Object>> selectAllColumn() {
        String queryString = "Select * From student";
        List<Map<String, Object>> columns = jdbcTemp.queryForList(queryString);
        return columns;
    }
    
    private static Map<String, Object> selectColumn(int id) {
        String sql = "Select * from student where id=?";
        Map<String, Object> item = jdbcTemp.queryForObject(sql, new RowMapper<Map<String, Object>>() {
            @Override
            public Map<String, Object> mapRow(ResultSet rs, int rowNum) throws SQLException {
                HashMap<String, Object> row = new HashMap<>();
                row.put("id", rs.getInt(1));
                row.put("name", rs.getString(2));
                row.put("username", rs.getString(3));
                row.put("password", rs.getString(4));
                return row;
            }
        }, id);
        return item;
    }
}
