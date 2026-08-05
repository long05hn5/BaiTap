
package bai1;


public class Student {
    private String mssv;
    private String hoTen;
    private int tuoi;
    private double dTB;

    public Student() {
    }

    public Student(String mssv, String hoTen, int tuoi, double dTB) {
        this.mssv = mssv;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.dTB = dTB;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getdTB() {
        return dTB;
    }

    public void setdTB(float dTB) {
        this.dTB = dTB;
    }
    
    public String xepLoai(){
        if(this.dTB >= 8){
            return "Giỏi";
        } else if(this.dTB >= 7 && this.dTB <8 ){
            return "Khá";
        } else if (this.dTB >= 5 && this.dTB <7){
            return "Trung Bình";
        } else 
            return "Yếu";
    }

    @Override
    public String toString() {
        return  mssv + ", " + hoTen + ", " + tuoi + ", " +  dTB + ", " + this.xepLoai() ;
    }
    
    
 
}
