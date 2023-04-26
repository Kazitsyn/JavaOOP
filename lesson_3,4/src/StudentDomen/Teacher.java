package StudentDomen;

public class Teacher extends User{
    private int teacherId;
    private String academicDegree;

    public Teacher(String firstName, String secondName, int age, int teacherId) {
        super(firstName, secondName, age);
        this.teacherId = teacherId;
    }
}
