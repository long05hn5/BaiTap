package storemanager;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Invoice {

    private ArrayList<InvoiceItem> items;
    private String customerId;
    private String employeeId;
    private String date;
    private double total;

    public Invoice() {
    }

    public Invoice(ArrayList<InvoiceItem> items, String customerId, String employeeId, String date) {
        this.items = items;
        this.customerId = customerId;
        this.employeeId = employeeId;
        this.date = date;
    }

    public ArrayList<InvoiceItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<InvoiceItem> items) {
        this.items = items;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getTotal() {
        return caculateTotal();
    }

    public double caculateTotal() {
        for (InvoiceItem item : items) {
            total = total + item.getTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        return items + ", " + employeeId + ", " + customerId + ", " + date + ", " + total;
    }

}
