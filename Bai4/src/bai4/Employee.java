
package bai4;


public class Employee {
    private int mNV;
    private String hoVaTen;
    private float luongCoBan;
    private int soNgayCong;

    public Employee() {
    }

    public Employee(int mNV, String hoVaTen, float luongCoBan, int soNgayCong) {
        this.mNV = mNV;
        this.hoVaTen = hoVaTen;
        this.luongCoBan = luongCoBan;
        this.soNgayCong = soNgayCong;
    }

    public int getmNV() {
        return mNV;
    }

    public void setmNV(int mNV) {
        this.mNV = mNV;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public float getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(float luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public int getSoNgayCong() {
        return soNgayCong;
    }

    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }

   public float luong(float luong){
       luong = (this.luongCoBan * this.soNgayCong)/26;
       return luong;
   }

    @Override
    public String toString() {
        return mNV + ", " + hoVaTen +  ", " + luongCoBan  + ", " + soNgayCong +", " + this.luong(luongCoBan);
    }
   
   
}
