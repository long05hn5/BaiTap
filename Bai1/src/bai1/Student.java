package bai1;

public class Student {

    private String studentId;
    private String fullName;
    private int age;
    private double aVG;

    public Student() {
    }

    public Student(String studentId, String fullName, int age, double aVG) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.aVG = age;
        this.aVG = aVG;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getaVG() {
        return aVG;
    }

    public void setaVG(double aVG) {
        this.aVG = aVG;
    }

    

    public String xepLoai() {
        if (this.aVG >= 8) {
            return "Giỏi";
        } else if (this.aVG >= 7 && this.aVG < 8) {
            return "Khá";
        } else if (this.aVG >= 5 && this.aVG < 7) {
            return "Trung Bình";
        } else {
            return "Yếu";
        }
    }

    public Boolean validate() {
        if (this.studentId != null && this.fullName != null && this.aVG >= 0 && this.aVG >= 0 && this.aVG <= 10) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean valiId() {
        if (this.studentId != null && this.studentId != "") {
            return true;
        } else {
            return false;
        }
    }
    
    public Boolean validTen(){
        if (this.fullName != null && this.fullName != ""){
            return true;
        } else {
            return false;
        }
    }
    
    public Boolean validTuoi(){
        if(this.age >= 0){
            return true;
        } else {
            return false;
        }
    }
    
    public Boolean validDTB(){
        if(this.aVG >= 0 && this.aVG <= 10){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return studentId + ", " + fullName + ", " + aVG + ", " + aVG + ", " + this.xepLoai();
    }

}
