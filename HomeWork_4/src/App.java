
import java.net.NoRouteToHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import Controllers.EmploeeController;
import StudentDomen.*;
import StudentService.AverageAge;
import StudentService.TeacherService;

public class App {
    public static void main(String[] args) throws Exception {
         User u1 = new User("Сергей","Иванов",25);
         Student s1 = new Student("Сергей", "Иванов", 22, (long)101);
         Student s2 = new Student("Андрей", "Сидоров", 22, (long)111);
         Student s3 = new Student("Иван", "Петров", 22, (long)121);
         Student s4 = new Student("Игорь", "Иванов", 23, (long)301);
         Student s5 = new Student("Даша", "Цветкова", 23, (long)171);
         Student s6 = new Student("Лена", "Незабудкина", 23, (long)104);

         List<Student> listStud = new ArrayList<Student>();
         listStud.add(s1);
         listStud.add(s2);
         listStud.add(s3);
         listStud.add(s4);
         listStud.add(s5);
         listStud.add(s6);

        // StudentGroup group = new StudentGroup(listStud);

        // for(Student stud : group)
        // {
        //     System.out.println(stud);
        // }

        // System.out.println("============= после сортировки =============");
        // Collections.sort(group.getStudents());


        // for(Student stud : group)
        // {
        //     System.out.println(stud);
        // }
        

        Emploee peron1 = new Emploee("Олег", "Иванов", 55, 110);
        Emploee peron2 = new Emploee("Семён", "Варошилов", 42, 111);
        Emploee peron3 = new Emploee("Дарья", "Денисова", 35, 112);
        Emploee peron4 = new Emploee("Виктория", "Щелокова", 45, 113);
        Emploee peron5 = new Emploee("Степан", "Романов", 22, 114);
        List<Emploee> perons = new ArrayList<>();
        perons.add(peron1);
        perons.add(peron2);
        perons.add(peron3);
        perons.add(peron4);
        perons.add(peron5);
//        Student s1 = new Student("Сергей", "Иванов", 22, (long)101);

        //EmploeeController contrEmp = new EmploeeController();
        EmploeeController.paySalary(peron1);
        //contrEmp.paySalary(s1);

        Integer studHour[] = {124,234,231,1,45};
        System.out.println(EmploeeController.mean(studHour));

        Double emplSalary[] = {12555.23,34213.5,10000.0};
        System.out.println(EmploeeController.mean(emplSalary));
        
        //System.out.println(u1);
        //System.out.println(s1);
        //System.out.println(group);

//        Teacher t1 = new Teacher("Вторник", "Среда",80,2,"Docent");
//        Teacher t2 = new Teacher("Вадим", "Силкин",30,3,"Docent");
//        Teacher t3 = new Teacher("Дианна", "Арбенина",35,4,"Docent");
//        Teacher t4 = new Teacher("Илья", "Муромец",300,5,"Docent");

        TeacherService ts1 = new TeacherService();
        ts1.create("Четверг", "Среда",80);
        ts1.create("Вадим", "Силкин",30);
        ts1.create("Янна", "Арбенина",35);
        ts1.create("Илья", "Муромец",300);
        ts1.getSortedByFIOTeacherGroup();
        for(var item:ts1.getSortedByFIOTeacherGroup()){
            System.out.println(item);
        }

        AverageAge<Teacher> aAge1 = new AverageAge<>(ts1.getAll());
        System.out.println(aAge1);
        AverageAge<Student> aAge2 = new AverageAge<Student>(listStud);
        System.out.println(aAge2);
        AverageAge<Emploee> aAge3 = new AverageAge<Emploee>(perons);
        System.out.println(aAge3);
        Double[] averageAgeAll = new Double[]{aAge1.averageAge(),aAge2.averageAge(),aAge3.averageAge()};
        System.out.printf("Средний возвраст всх сотрудников,учетелей и студентов = %.2f", EmploeeController.mean(averageAgeAll));
    }
}
