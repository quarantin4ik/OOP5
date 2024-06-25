package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controller.StudentController;
import controller.StudyGroupController;
import controller.TeacherController;
import model.StudyGroup;
import model.DB.DataBase;
import model.impl.Student;
import model.impl.Teacher;

public class StudentView {
    private StudentController controller = new StudentController();
    private StudyGroupController sGroupController = new StudyGroupController();
    private TeacherController teacherController = new TeacherController();

    public void start(){
        DataBase.fillDB();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1 - создать студента");
            System.out.println("2 - создать преподавателя");
            System.out.println("3 - найти студента по id");
            System.out.println("4 - найти преподавателя по id");
            System.out.println("5 - распечатать информацию о всех студентах");
            System.out.println("6 - создать учебную группу");
            System.out.println("0 - выход");
            
            switch (scanner.nextInt()) {
                case 1 -> createStudent();
                case 2 -> createTeacher();
                case 3 -> getById();
                case 4 -> getByIdT();
                case 5 -> getAllStudents();
                case 6 -> getStudyGroup();
                case 0 -> System.exit(0);// выход из приложения
            
                default -> System.out.println("Операция не поддерживается");
            }
        }

    }

    private Student createStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию:");
        String lastName = scanner.nextLine();
        Student student = controller.createStudent(name, lastName);
        System.out.println(student);
        return student;
    }

    private Teacher createTeacher(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию:");
        String lastName = scanner.nextLine();
        Teacher t = teacherController.createTeacher(name, lastName);
        System.out.println(t);
        return t;
    }

    private Student getById(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id студента: ");
        int id = scanner.nextInt();
        Student student = controller.getById(id);
        System.out.println(student);
        return student;
    }

    private Teacher getByIdT(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id преподавателя: ");
        int id = scanner.nextInt();
        Teacher teacher = teacherController.getByIdT(id);
        System.out.println(teacher);
        return teacher;
    }
    private List<Student> getAllStudents(){
        List<Student> students = controller.getAllStudents();
        System.out.println(students);
        return students;
    }
    private StudyGroup getStudyGroup(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id преподователя");
        int tId = scanner.nextInt();
        List <Integer> sc = new ArrayList<>();
        System.out.println("Введите колличество студентов:");
        int count = scanner.nextInt();
        System.out.println("Введите id студента");
        for (int i = 0; i != count; i++) {
            sc.add(scanner.nextInt());

        }
        return sGroupController.getStudyGroup(tId, sc);
    }
}
