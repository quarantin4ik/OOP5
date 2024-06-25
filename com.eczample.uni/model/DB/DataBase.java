package model.DB;

import java.util.ArrayList;
import java.util.List;

import model.StudyGroup;
import model.impl.Student;
import model.impl.Teacher;
import service.TeacherService;
//симулирует базу данных
public class DataBase {
    public static final List<Student> studentsDB = new ArrayList<>();
    public static final List<Teacher> teachersDB = new ArrayList<>();
    public static final List<StudyGroup> StudyGroupDB = new ArrayList<>();

    public static void fillDB(){
        Teacher teacher = new Teacher(1,"Вася", "Иванов");
        StudyGroup studyGroup = new StudyGroup(teacher);
        TeacherService tService = new TeacherService();
        tService.addGroupId(studyGroup);
        teachersDB.add(teacher);
        Student s1 = new Student(1, "Рикон", "Старк");
        Student s2 = new Student(2, "Джофри", "Ланистер");
        studentsDB.add(s1);
        studentsDB.add(s2);
    }
}