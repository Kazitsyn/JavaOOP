package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> students;
    private long studentsId;

    /**
     * Конструктор
     * @param students Список студентов
     */
    public StudentGroup(List<Student> students) {
        this.students = students;
    }

    /**
     * Конструктор
     * @param students Список студентов
     * @param studentsId Индификатор списка студентов
     */
    public StudentGroup(List<Student> students, long studentsId) {
        this.students = students;
        this.studentsId = studentsId;
    }

    /**
     * Получить список студентов
     * @return
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Установить список студентов
     * @param students
     */
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>(){
            private int index = 0;
            @Override
            public boolean hasNext() {
               return index<students.size();
            }
            @Override
            public Student next() {
                if(!hasNext())
                {
                    return null;
                }
                //counter++;
                return students.get(index++);        
            }

        };
    }

    /**
     * Compares this object with the specified object for order.  Returns a
     * negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.
     *
     * <p>The implementor must ensure
     * {@code sgn(x.compareTo(y)) == -sgn(y.compareTo(x))}
     * for all {@code x} and {@code y}.  (This
     * implies that {@code x.compareTo(y)} must throw an exception iff
     * {@code y.compareTo(x)} throws an exception.)
     *
     * <p>The implementor must also ensure that the relation is transitive:
     * {@code (x.compareTo(y) > 0 && y.compareTo(z) > 0)} implies
     * {@code x.compareTo(z) > 0}.
     *
     * <p>Finally, the implementor must ensure that {@code x.compareTo(y)==0}
     * implies that {@code sgn(x.compareTo(z)) == sgn(y.compareTo(z))}, for
     * all {@code z}.
     *
     * <p>It is strongly recommended, but <i>not</i> strictly required that
     * {@code (x.compareTo(y)==0) == (x.equals(y))}.  Generally speaking, any
     * class that implements the {@code Comparable} interface and violates
     * this condition should clearly indicate this fact.  The recommended
     * language is "Note: this class has a natural ordering that is
     * inconsistent with equals."
     *
     * <p>In the foregoing description, the notation
     * {@code sgn(}<i>expression</i>{@code )} designates the mathematical
     * <i>signum</i> function, which is defined to return one of {@code -1},
     * {@code 0}, or {@code 1} according to whether the value of
     * <i>expression</i> is negative, zero, or positive, respectively.
     *
     * @param o the object to be compared.
     * @return a negative integer, zero, or a positive integer as this object
     * is less than, equal to, or greater than the specified object.
     * @throws NullPointerException if the specified object is null
     * @throws ClassCastException   if the specified object's type prevents it
     *                              from being compared to this object.
     */
    @Override
    public int compareTo(StudentGroup o) {
        if(this.students.size()==o.students.size())
        {
            if (this.studentsId == o.studentsId){
                return 0;
            } else if (this.studentsId < o.studentsId) {
                return -1;
            }
            return 1;

        }
        if(this.students.size()<o.students.size())
        {
            return -1;
        }
        return 1;
    }


    @Override
    public String toString() {
        String temp = "StudentGroup{" +
                "studentsId=" + studentsId +
                ", students=" + students.size() +
                '}' + "\n";
        for(Student stud: this.students){
            temp += "\t\t" + stud.toString() + "\n";
        }
        return temp;
    }

}
