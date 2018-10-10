package com.britreasure.memoir.model;


import org.springframework.data.annotation.Id;

/**
 * @author xcyxiner
 * @create: 2018-10-09 下午6:05
 */
public class User {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Id
    private String id;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String username;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private Integer age;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;
    private String password;

    public User() {
    
    }

    public User(String username, Integer age) {
        this.username = username;
        this.age = age;
    }
}
