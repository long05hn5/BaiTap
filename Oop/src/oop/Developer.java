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
    
    

    @Override
    void work() {
        System.out.println("Nhân viên đang làm từ xa");
    }

    @Override
    public String toString() {
        return super.toString() + "Lập trình ngôn ngữ: " + programmingLanguage;
    }

}
