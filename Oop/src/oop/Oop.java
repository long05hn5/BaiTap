package oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Oop {

    public static void main(String[] args) {
        Utility uti = new Utility();
        Scanner sc = new Scanner(System.in);
        int choice;
        String key;
        do {
            uti.printMenu();
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    Manager mag = uti.inputManager();
                    uti.insertManagerToList(mag);
                    break;
                case 2:
                    uti.printListManager();
                    break;
                case 3:
                    System.out.println("Nhập key: ");
                    key = sc.nextLine();
                    ArrayList<Manager> mage = uti.searchList(key);
                    uti.printListManager();
                    break;
                case 4:
                    int id = uti.inputID();
                    uti.setManger(id);
                    uti.printListManager();
                    break;
                case 5:
                    int id2 = uti.inputID();
                    uti.deleteById(id2);
                    uti.printListManager();
                    break;
            }
        } while (choice != 0);
    }

}
