package bai2;

public class Rectangle {

    private int length;
    private int width;

    public Rectangle() {
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String hinhVuong() {
        if (this.length % this.width == 0) {
            return "Hinh Vuong";
        } else {
            return "Khong phai la hinh Vuong";
        }
    }

    public int tinhDienTich() {
        int dienTich = 0;
        dienTich = this.length * this.width;
        return dienTich;
    }

    public Boolean validLen() {
        if (this.length > 0) {
            return true;
        }
        return false;
    }

    public Boolean validWid() {
        if (this.width > 0) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Chieu Dai: " + length + ", " + "Chieu Rong: " + width + ", " + this.hinhVuong() + ", " + this.tinhDienTich();
    }
}
