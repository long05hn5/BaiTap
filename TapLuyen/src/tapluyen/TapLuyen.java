/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tapluyen;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TapLuyen {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library lib = new Library();
        int choice;
        String key;
        do{
            lib.printMenu();
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    Book book = lib.createBook();
                    lib.insertBookToLibary(book);
                    break;
                case 2:
                    int id = lib.inputId();
                    lib.deleteBookById(id);
                    lib.printListBook();
                    break;
                case 3:
                    int id2 = lib.inputId();
                    lib.searchBookById(id2);
                    break;
                case 4:
                    System.out.println("Nhập key");
                    key = sc.nextLine();
                    ArrayList<Book> bookk = lib.searchBookByTitle(key);
                    System.out.println(bookk);
                    break;
                case 5:
                    lib.printListBook();
                    break;
                case 6:
                    lib.countListBookByTitle();
                    break;
                case 7:
                    lib.searchMaxPriceBook();
                    break;
                case 8:
                    lib.caculateTotal();
                    break;
                case 9:
                    lib.viewArrange();
                   break;
                case 10:
                    lib.arrangeListBookByTitle();
                    break;
            }
                
            
        }while(choice !=0);
    }   
}
