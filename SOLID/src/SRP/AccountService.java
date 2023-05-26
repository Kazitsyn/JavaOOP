package SRP;

public class AccountService {
    private Emploee emploee;
    private int baseSalary;

    public AccountService(Emploee emploee, int baseSalary) {
        this.emploee = emploee;
        this.baseSalary = baseSalary;
    }

    public int calculateNetSalary(){
        int tax = (int)(baseSalary*0.25);
        return baseSalary - tax;
    }
}
