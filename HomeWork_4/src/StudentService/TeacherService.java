package StudentService;

import StudentDomen.Emploee;
import StudentDomen.Teacher;
import StudentDomen.UserComparator;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements iUserService<Teacher>{
    private int count;
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }

    @Override
    public void create(String firstName, String secondName, int age) {
        Teacher teach = new Teacher(firstName, secondName, age, count, "Docent");
        count++;
        teachers.add(teach);
    }
    @Override
    public List getAll() {
        return teachers;
    }
    public List<Teacher> getSortedByFIOTeacherGroup()
    {
        List<Teacher> teach = new ArrayList<>(teachers);
        teach.sort(new UserComparator<Teacher>());
        return teach;
    }
}
