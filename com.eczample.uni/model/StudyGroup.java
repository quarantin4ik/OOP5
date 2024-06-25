package model;

import java.util.List;

import model.DB.DataBase;
import model.impl.Student;
import model.impl.Teacher;

public class StudyGroup {
    public static int id;
    public String name;
    public Teacher teacher;

    public static List<Student> students;

    public StudyGroup(Teacher t, List<Student> s){
        StudyGroup.students = s;
        this.teacher = t;
        StudyGroup.id = DataBase.StudyGroupDB.size() + 1;
    }

    public StudyGroup(Teacher t){
        this.teacher = t;
        StudyGroup.id = DataBase.StudyGroupDB.size() + 1;
    }
    
}