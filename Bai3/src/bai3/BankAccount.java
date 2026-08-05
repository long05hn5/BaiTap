package bai3;

public class BankAccount {

    private int sTK;
    private String tenTK;
    private float soDu;

    public BankAccount() {
    }

    public BankAccount(int sTK, String tenTK, float soDu) {
        this.sTK = sTK;
        this.tenTK = tenTK;
        this.soDu = soDu;
    }

    public int getsTK() {
        return sTK;
    }

    public void setsTK(int sTK) {
        this.sTK = sTK;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public float getSoDu() {
        return soDu;
    }

    public void setSoDu(float soDu) {
        this.soDu = soDu;
    }

    public float napTien(float napTien) {
        this.soDu = napTien + this.soDu;
        return this.soDu;
    }

    public float rutTien(float rutTien) {
        if (this.soDu >= rutTien) {
            this.soDu = this.soDu - rutTien ;
        }
        return this.soDu;
    }

    @Override
    public String toString() {
        return sTK + ", " + tenTK + ", " + soDu;
    }

}
