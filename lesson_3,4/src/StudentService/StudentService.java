package StudentService;

import StudentDomen.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements iUserService<Student> {
    private List<Student> students;
    private int count;

    public StudentService() {

        this.students = new ArrayList<Student>();
    }

    public List<Student> getAll(){
        return this.students;
    }

    @Override
    public void create(String firstname, String secondName, int age) {

    }
}
