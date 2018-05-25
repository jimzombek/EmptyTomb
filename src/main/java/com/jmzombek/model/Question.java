package com.jmzombek.model;

public class Question {
    private Integer Id;
    private String name;
    private Integer birthYear;
    
    public Integer getId() {
        return Id;
    }
    public void setId(Integer id) {
        Id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Integer getBirthYear() {
        return birthYear;
    }
    
    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }
 
}