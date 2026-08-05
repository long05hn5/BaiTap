
package bai2;


public class Rectangle {
    private int chieuDai;
    private int chieuRong;

    public Rectangle() {
    }

    public Rectangle(int chieuDai, int chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }

    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }
    
    public String hinhVuong(){
        if(this.chieuDai % this.chieuRong == 0 ){
            return "Hinh Vuong";
        } else 
            return "Khong phai la hinh Vuong";      
    }
    
    public int tinhDienTich(){
        int dienTich = 0;
        dienTich = this.chieuDai * this.chieuRong;
        return dienTich;
    }

    @Override
    public String toString() {
        return  "Chieu Dai: " + chieuDai + ", " + "Chieu Rong: " + chieuRong + ", " + this.hinhVuong() + ", " + this.tinhDienTich() ;
    }
    
    
}
