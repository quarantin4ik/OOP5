package controller;

import model.DB.DataBase;
import model.impl.Teacher;
import service.TeacherService;

public class TeacherController {
    TeacherService service = new TeacherService();

    public Teacher createTeacher(String name, String lastName) {
        int id = DataBase.StudyGroupDB.size() + 1;
        return service.createTeacher(id, name, lastName);

    }

    public Teacher getByIdT(int id) {

        Teacher teacher = null;
    try {
        teacher = service.getById(id);
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    return teacher;
    }
}
