package Controller;

import Model.Student;

import java.util.HashMap;

public interface iGetModelHM extends iGetModel{
    public HashMap<Long, Student> getStudentHashMap();

}
