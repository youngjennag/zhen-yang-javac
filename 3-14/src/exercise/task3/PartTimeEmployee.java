package exercise.task3;

public class PartTimeEmployee extends Employee {
    int hourlyWage;
    int hoursWorked;   
    
    public PartTimeEmployee(String name, int hourlyWage, int hoursWorked) {
        super(name);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    public String getRole() {
        return role;
    }

    public int calculateSalary() {
        int salary = hourlyWage * hoursWorked;
        return salary;
    }
}
