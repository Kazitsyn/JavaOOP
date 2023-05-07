package Controllers;

import StudentDomen.Teacher;

public class TeacherController implements iUserController<Teacher>{
    private final TeacherController teachService = new TeacherController();
    @Override
    public void create(String firstName, String secondName, int age) {
        teachService.create(firstName, secondName, age);
    }
}
