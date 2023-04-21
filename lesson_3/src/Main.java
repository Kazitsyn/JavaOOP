import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        User us1 = new User("Ivan", "Petrov", 35);
        System.out.println(us1.toString());
        Student st1 = new Student("Sergey", "Ivanov", 18, 1522);
        Student st2 = new Student("Andrey", "Sidorov", 19, 1544);
        Student st3 = new Student("Petr", "Romanov", 20, 1455);
        Student st4 = new Student("Anton", "Petrov", 21, 1666);
        Student st5 = new Student("Anna", "Ivanova", 22, 1452);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        StudentGroup stg1 = new StudentGroup(students);
        for (Student item: stg1){
            System.out.println(item);
        }
        System.out.println();
        Collections.sort(stg1.getStudents());
        for (Student item: stg1){
            System.out.println(item);
        }
    }
}