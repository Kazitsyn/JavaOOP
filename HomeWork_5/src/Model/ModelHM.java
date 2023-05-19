package Model;

import Controller.*;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ModelHM extends Model implements iGetModel, iGetModelHM {
    private HashMap<Long, Student> studentHashMap;

    /**
     * Конструктор класса ModelHashMap где ключь это id студента
     * @param students
     */
    public ModelHM(List<Student> students) {
        super(students);
        this.studentHashMap = new HashMap<>();
        for (Student item: students){
            studentHashMap.put(item.getStudentID(), item);
        }

    }

    /**
     * Получить список студента из словаря
     * @return
     */
    public List<Student> getAllStudent()
    {
        List<Student> result = new ArrayList<>();
        for (Student item:studentHashMap.values()){
            result.add(item);
        }

        return result;
    }


    public HashMap<Long, Student> getStudentHashMap() {
        return studentHashMap;
    }
}
