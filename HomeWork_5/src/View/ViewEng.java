package View;

import Controller.iGetView;
import Controller.iGetViewHM;
import Model.Student;

import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ViewEng implements iGetView, iGetViewHM {
    public void printAllStudent(List<Student> students)
    {
        System.out.println("-----Displaying a list employees-----");
        for(Student person :students)
        {
            System.out.println(person);
        }
        System.out.println("-----end of the list-----");
    }

    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
    @Override
    public void printAllStudent(HashMap<Key, Student> studentHashMap) {
        System.out.println("-----Displaying a list employees-----");
        for(Student person :studentHashMap.values())
        {
            System.out.println(person);
        }
        System.out.println("-----end of the list-----");
    }
}
