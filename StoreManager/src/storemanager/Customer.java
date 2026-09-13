/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package storemanager;

/**
 *
 * @author Admin
 */
public class Customer {

    private String nameCustomer, phoneNumber;

    public Customer() {
    }

    public Customer(String nameCustomer, String phoneNumber) {
        this.nameCustomer = nameCustomer;
        this.phoneNumber = phoneNumber;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Tên khách hàng: " + nameCustomer + ", " + "Số điện thoại khách hàng:" + phoneNumber;
    }

    public String formatToSaveFile() {
        return nameCustomer + ", " + phoneNumber;
    }

}
