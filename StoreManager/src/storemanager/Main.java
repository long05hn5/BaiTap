
package storemanager;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Utility ut = new Utility();
        ut.readCustomersFromFile();
        ut.readProductFromToFile();
        ut.readEmployeeFromFile();
        ut.Order();
    }
}