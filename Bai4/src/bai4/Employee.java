package bai4;

public class Employee {

    private int employeeId;
    private String fullName;
    private float basicSalary;
    private int workDays;

    public Employee() {
    }

    public Employee(int employeeId, String fullName, float basicSalary, int workDays) {
        this.employeeId = employeeId;
        this.fullName = fullName;
        this.basicSalary = basicSalary;
        this.workDays = workDays;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public float getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    public float calculateSalary(float salary) {
        salary = (this.basicSalary * this.workDays) / 26;
        return salary;
    }

    public boolean validId() {
        if (this.employeeId > 0) {
            return true;
        }
        return false;
    }

    public boolean validName() {
        if (this.fullName != null && this.fullName != "") {
            return true;
        }
        return false;
    }

    public boolean validBas() {
        if (this.basicSalary >= 0) {
            return true;
        }
        return false;
    }

    public boolean validWor() {
        if (this.workDays >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return employeeId + ", " + fullName + ", " + basicSalary + ", " + workDays + ", " + this.calculateSalary(basicSalary);
    }
}
