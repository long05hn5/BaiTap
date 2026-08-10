package oop;

public class Employee {

    private String name;
    private float salary;

    public Employee() {
    }

    public Employee(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    void work() {
        System.out.println("Nhân viên đang làm việc ");
    }

    public float calculateSalary(int day) {
        return salary = this.salary * day;
    }

    public float calculateSalary(int day, float bonus) {
        return salary = (this.salary * day) + bonus;
    }

    public boolean validName() {
        if (this.name != null && this.name != "") {
            return true;
        }
        return false;
    }

    public boolean validSalary() {
        if (this.salary >= 0) {
            return true;
        }
        return false;
    }
    
    public boolean validDay(int day) {
        if (day >= 0) {
            return true;
        }
        return false;
    }

    public static String companyInfo() {
        return "Khong di lam tre";
    }

    @Override
    public String toString() {
        return "Nhân viên tên: " + name + ", " + " Mức lương: " + salary;
    }

}
