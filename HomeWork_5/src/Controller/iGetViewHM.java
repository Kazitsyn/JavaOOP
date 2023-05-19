package Controller;

import Model.Student;

import java.security.Key;
import java.util.HashMap;
import java.util.List;

public interface iGetViewHM extends iGetView{
    void printAllStudent(HashMap<Key, Student> studentHashMap);
}
