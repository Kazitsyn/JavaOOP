package StudentDomen;
import StudentService.iAverageAge;
public class Teacher extends User implements iAverageAge {
    
    private int teacherId;
    private String academicDegree;

    public Teacher(String firstName, String secondName, int age, int teacerId, String academicDegree ) {
        super(firstName, secondName, age);
       this.teacherId = teacherId;
       this.academicDegree = academicDegree;
    }


    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getLevel() {
        return academicDegree;
    }

    public void setLevel(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    /**
     * Получить возвраст
     * @return age
     */
    @Override
    public int getAge(){
        return super.getAge();
    }

//    /**
//     * Получить тип класса
//     *
//     * @return
//     */
//    @Override
//    public String getClassType() {
//        return getClass().getSimpleName();
//    }

    @Override
    public String toString() {
        return "Teacher{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", age=" + super.getAge() +
                "teacherId=" + teacherId +
                ", academicDegree='" + academicDegree + '\'' +
                '}';
    }
}
