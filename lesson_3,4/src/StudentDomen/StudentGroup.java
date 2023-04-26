package StudentDomen;

import java.util.*;
import java.util.function.Consumer;

public class StudentGroup implements Iterable<Student>{
    private List<Student> students;

    public StudentGroup(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(students);
    }

    @Override
    public void forEach(Consumer<? super Student> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Student> spliterator() {
        return Iterable.super.spliterator();
    }

}
