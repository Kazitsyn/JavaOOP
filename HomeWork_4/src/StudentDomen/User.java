package StudentDomen;

public class User {
    private String firstName;
    private String secondName;
    private int age;

    /**
     * Конструктор
     * @param firstName Имя
     * @param secondName Фамилия
     * @param age Возвраст
     */
    public User(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    /**
     * Получить имя
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Установить имя
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Получить фамилию
     * @return
     */
    public String getSecondName() {
        return secondName;
    }

    /**
     * Установить фамилию
     * @param secondName
     */
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    /**
     * Получить возвраст
     * @return
     */
    public int getAge() {
        return age;
    }

    /**
     * Устновить возвраст
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }
}
