package com.example;

import org.springframework.stereotype.Component;


@Component
public class StudentEntity {
    private int id;
    private String name;
    private int marks;

    public StudentEntity(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    public StudentEntity(){}

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

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
