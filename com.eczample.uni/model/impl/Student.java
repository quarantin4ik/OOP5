package model.impl;

import model.User;

public class Student extends User{

    public Student(int id, String name, String lastName) {
        super(name, lastName);
        this.id = id;
    }

    
    
}