package StudentService;

import java.util.List;

public interface iUserService<T> {
    List<T> getAll();
    void create(String firstname, String secondName, int age);
}
