package controller;

import java.util.List;

import model.StudyGroup;
import model.impl.Student;
import model.impl.Teacher;
import service.StudyGroupService;

public class StudyGroupController {
    private StudyGroupService service = new StudyGroupService();
    private TeacherController tService = new TeacherController();

    public StudyGroup createStudyGroup(Teacher t, List<Student> s){
        return service.createStudyGroup(t, s);
    }

    public StudyGroup getStudyGroup(int t, List<Integer> s){
        return service.getStudyGroup(tService.getByIdT(t), s);
    }
}
