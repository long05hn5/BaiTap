
package bai2;

import java.util.Scanner;


public class Bai2 {

    
    public static void main(String[] args) {
//       Rectangle rec = new Rectangle(5,5);
//        System.out.println(rec.toString());

        Scanner sc = new Scanner(System.in);
        Rectangle rec = new Rectangle();
        int length;
        do{
            System.out.println("Nhap chieu dai: ");
            length = sc.nextInt();
            rec.setLength(length);
        }while(!rec.validLen());
        
        int width;
        do{
            System.out.println("Nhap chieu rong: ");
            width = sc.nextInt();
            rec.setWidth(width);
        }while(!rec.validWid());
        System.out.println(rec.toString());
    }
    
}
