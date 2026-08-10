package oop;

public class Manager extends Employee {

    private String department;

    public Manager() {
    }

    public Manager(String department) {
        this.department = department;
    }

    public Manager(String department, String name, float salary) {
        super(name, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public float calculateSalary(int day) {
        return super.calculateSalary(day) * 2;
    }

    @Override
    void work() {
        System.out.println("Nhân viên đang nghỉ");
    }

    @Override
    public String toString() {
        return super.toString() + "Làm việc tại phòng ban: " + department;
    }

}
