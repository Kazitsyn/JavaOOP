package SRP;

import java.util.Date;

public class Emploee {
    private String name;
    private Date dob;

    public Emploee(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }

    public String getEmplInfo() {
        return  "name - " + name + '\'' +
                ", dob - " + dob.toString();
    }
}
