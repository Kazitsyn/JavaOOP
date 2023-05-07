import java.net.NoRouteToHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.User;
import StudentDomen.StudentSteam;

public class App {
    public static void main(String[] args) throws Exception {
        User u1 = new User("Сергей","Иванов",25);
        Student s1 = new Student("Сергей", "Иванов", 22, (long)101);
        Student s2 = new Student("Андрей", "Сидоров", 22, (long)111);
        Student s3 = new Student("Иван", "Петров", 22, (long)121);
        Student s4 = new Student("Игорь", "Иванов", 23, (long)301);
        Student s5 = new Student("Даша", "Цветкова", 23, (long)171);
        Student s6 = new Student("Лена", "Незабудкина", 23, (long)104);
        Student s7 = new Student("Лев", "Крапоткин", 32, (long)102);
        Student s8 = new Student("Анна", "Кошкина", 21, (long)103);
        Student s9 = new Student("Инга", "Иванова", 33, (long)108);
        Student s10 = new Student("Игорь", "Тимохин", 18, (long)105);
        Student s11 = new Student("Даша", "Масколенко", 28, (long)106);
        Student s12 = new Student("Лена", "Макусинская", 66, (long)107);
        Student s13 = new Student("Сергей", "Безруков", 22, (long)109);
        Student s14 = new Student("Владимир", "Маяковский", 23, (long)110);
        Student s15 = new Student("Петр", "Петров", 40, (long)112);
        Student s16 = new Student("Светлана", "Бабочкина", 33, (long)113);
        Student s17 = new Student("Василиса", "Василенко", 31, (long)114);
        Student s18 = new Student("Леонид", "Рябошапка", 29, (long)115);

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);

        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s7);
        listStud2.add(s8);
        listStud2.add(s9);
        listStud2.add(s10);
        listStud2.add(s11);
        listStud2.add(s12);


        List<Student> listStud3 = new ArrayList<Student>();
        listStud3.add(s13);
        listStud3.add(s14);
        listStud3.add(s15);
        listStud3.add(s16);
        listStud3.add(s17);
        listStud3.add(s18);

        StudentGroup group = new StudentGroup(listStud, 422);
        StudentGroup group2 = new StudentGroup(listStud2, 222);
        StudentGroup group3 = new StudentGroup(listStud3, 322);

        for(Student stud : group)
        {
            System.out.println(stud);
        }

        System.out.println("============= после сортировки =============");
        Collections.sort(group.getStudents());


        for(Student stud : group)
        {
            System.out.println(stud);
        }

        System.out.println("-----------------------------------------------------------------------------");

        List<StudentGroup> steam = new ArrayList<StudentGroup>();
        steam.add(group);
        steam.add(group2);
        steam.add(group3);

        StudentSteam steam1 = new StudentSteam(steam, 1);

        for(StudentGroup groupp : steam1)
        {
            System.out.println("***");
            for(Student stud : groupp)
            {
                System.out.println(stud);

            }

        }

        System.out.println("============= после сортировки =============");
        Collections.sort(steam1.getStudentGroups());

        for(StudentGroup groupp : steam1)
        {
            System.out.println("***");
            for(Student stud : groupp)
            {
                System.out.println(stud);

            }
        }

        System.out.println(steam1);

    }
}
