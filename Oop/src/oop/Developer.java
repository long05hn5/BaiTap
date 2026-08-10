package oop;

public class Developer extends Employee {

    private String programmingLanguage;

    public Developer() {
    }

    public Developer(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public Developer(String programmingLanguage, String name, float salary) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
    
    public boolean validPL(){
        if(this.programmingLanguage != null && this.programmingLanguage != ""){
            return true;
        } return false;
    }

    @Override
    void work() {
        System.out.println("Nhân viên đang làm từ xa");
    }

    @Override
    public String toString() {
        return "Developer tên: " + super.getName() + " , "  + " Mức lương: " + super.getSalary() +  ", " + "Lập trình ngôn ngữ: " + programmingLanguage;
    }

}
