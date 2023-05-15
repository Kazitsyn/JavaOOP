package StudentDomen;
import StudentService.iAverageAge;
public class Emploee extends User implements iAverageAge{

    private int empId;

    public Emploee(String firstName, String secondName, int age, int empId) {
        super(firstName, secondName, age);
        this.empId = empId;
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

    /**
     * Получить возвраст
     * @return age
     */
    @Override
    public int getAge(){
        return super.getAge();
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

}
