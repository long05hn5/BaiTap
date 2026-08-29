/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tapluyen2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TapLuyen2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Khi new 1 đối tượng , con luôn được thực thi
        Utility ut = new Utility();
        
        int choice;
        do {
            ut.printMenu();
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    ut.input(sc);
                    break;
                case 2:
                    ut.printListProduct();
                    break;
                case 3:
                    int id = ut.inputId();
                    ut.deleteById(id);
                    break;
                case 4:
                    int id2 = ut.inputId();
                    ut.updateById(id2);
                    break;
                case 5:
                    ut.saveFile();
                    break;
            }
        } while (choice != 0);
    }

}
