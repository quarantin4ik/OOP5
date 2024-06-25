package service;

import java.util.ArrayList;
import java.util.List;

import controller.StudentController;
import model.StudyGroup;
import model.impl.Student;
import model.impl.Teacher;

public class StudyGroupService {
    public StudyGroup createStudyGroup(Teacher t, List<Student> s){
        return new StudyGroup(t, s);
    }

    public int getId(){
        return StudyGroup.id;
    }

    public void addStudents(List<Student> s){
        StudyGroup.students.addAll(s);
    }

    public StudyGroup getStudyGroup(Teacher t, List<Integer> s){
        StudentController studentControlle = new StudentController();
        List<Student> listSt = new ArrayList<>();
        for (int i : s) {
            Student student = studentControlle.getById(i);
            listSt.add(student);
        }
        System.out.println(t);
        System.out.println(listSt);
        return createStudyGroup(t, listSt);
    }
}
