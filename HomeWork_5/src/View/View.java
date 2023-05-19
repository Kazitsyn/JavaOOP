package View;

import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import Controller.*;
import Model.Student;

public class View implements iGetView, iGetViewHM {
    public void printAllStudent(List<Student> students)
    {
        System.out.println("-----Вывод списка студентов-----");
        for(Student person :students)
        {
            System.out.println(person);
        }
        System.out.println("-----Конец списка-----");
    }

    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    @Override
    public void printAllStudent(HashMap<Key, Student> studentHashMap) {
        System.out.println("-----Вывод списка студентов-----");
        for(Student person :studentHashMap.values())
        {
            System.out.println(person);
        }
        System.out.println("-----Конец списка-----");
    }
}
