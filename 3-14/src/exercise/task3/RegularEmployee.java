package exercise.task3;

public class RegularEmployee extends Employee {
    int baseSalary;

    // コンストラクタ
    public RegularEmployee(String name, int baseSalary) {
        super(name);
        this.baseSalary = baseSalary;
        this.role = "正社員";
    }

    @Override
    public String getRole() {
        return role;
    }

    @Override
    public int calculateSalary() {
        return baseSalary;
    }







}
