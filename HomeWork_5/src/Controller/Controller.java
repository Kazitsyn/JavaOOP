package Controller;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

//import javax.jws.WebParam.Mode;

import Model.Student;
import Model.*;
import View.View;

/**
 * Контроллер, класс объединяющий model и view
 */
public class Controller  {

    private List<Student> students; 
    private iGetView view;
    private iGetModelHM model;
    private HashMap<Long, Student> studentHashMap;

    /**
     * Конструктор
     * @param view
     * @param model
     */
    public Controller(iGetView view, iGetModelHM model) {
        this.view = view;
        this.model = model;
        this.students = new ArrayList<Student>();
    }

    /**
     * Получить список студентов
     */
    public void getAllStudent()
    {
        students = model.getAllStudent();
    }

    /**
     * Проверить пустой ли список или нет
     * @return
     */
    public boolean testData()
    {
        if(students.size()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Вывести список студентов на консоль
     */
    public void updateView()
    {
        //MVP
        getAllStudent();
        if(testData())
        {
            view.printAllStudent(students);
        }
        else{
            System.out.println("Список студентов пуст!");
        }
        
        //MVC
        //view.printAllStudent(model.getAllStudent());
    }

    /**
     * Удалить студента из списка
     */
    public void deleteStudent(){
        this.studentHashMap = model.getStudentHashMap();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ID студента , которого нужно удалить");
        long scan = scanner.nextLong();
        if (studentHashMap.containsKey(scan)){
            studentHashMap.remove(scan);
            this.students.clear();
            for (Student person: studentHashMap.values()){
                this.students.add(person);
            }
        }else {
            System.out.println("Нет студента с введеным ID");
        }
    }

    /**
     * Меню программы
     */
    public void run()
    {
        Commands com = Commands.NONE;
        boolean getNewIteration = true;
        while(getNewIteration)
        {
            String command = view.prompt("Введите команду:");
            com = Commands.valueOf(command.toUpperCase());

            switch(com)
            {
                case EXIT:
                    getNewIteration=false;
                    System.out.println("Выход из программы!");
                    break;
                case LIST:
                    getAllStudent();
                    updateView();
                    break;
                case READ:
                    this.studentHashMap = model.getStudentHashMap();
                    Scanner scanner = new Scanner(System.in);
                    long scan = scanner.nextLong();
                    System.out.println(studentHashMap.get(scan));
                    break;
                case DELETE:
                    deleteStudent();
                    updateView();
                    break;
            }

        }
    }

}
