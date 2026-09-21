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

    private String customerId, nameCustomer, phoneNumber;

    public Customer() {
    }

    public Customer(String customerId, String nameCustomer, String phoneNumber) {
        this.customerId = customerId;
        this.nameCustomer = nameCustomer;
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
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

   

    public String formatToSaveFile() {
        return nameCustomer + ", " + phoneNumber;
    }

}
