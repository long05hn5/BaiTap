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
        float salary = super.calculateSalary(day);
        float finalSalry = salary * 2;
        this.setSalary(finalSalry);
        return finalSalry;
    }

    public boolean validDeP() {
        if (this.department != null && this.department != "") {
            return true;
        }
        return false;
    }

    @Override
    void work() {
        System.out.println("Nhân viên đang nghỉ");
    }

    @Override
    public String toString() {
        return "Quản lý tên: " + super.getName() + " , "  + " Mức lương: " + super.getSalary() +  ", " + "Làm việc tại phòng ban: " + department;
    }

}
