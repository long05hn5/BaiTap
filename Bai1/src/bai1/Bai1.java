/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai1 {

    public static void main(String[] args) {
//        Student stu = new Student("HE191198","Nguyen Do Long", 21,8.5);
//        System.out.println(stu.toString());   
        Scanner sc = new Scanner(System.in);
        Student stu = new Student();
        String studentId;
        do {
            System.out.println("Nhap studentId: ");
            studentId = sc.nextLine();
            stu.setStudentId(studentId);
        } while (!stu.valiId());
        String fullName;
        do {
            System.out.println("Nhap ho va ten");
            fullName = sc.nextLine();
            stu.setFullName(fullName);
        } while (!stu.validTen());
        int tuoi;
        do {
            System.out.println("Nhap tuoi");
            tuoi = sc.nextInt();
            stu.setAge(tuoi);
        } while (!stu.validTuoi());
        double aVG;
        do {
            System.out.println("Nhap diem trung binh");
            aVG = sc.nextDouble();
            stu.setaVG(aVG);
        }while(!stu.validDTB());
        
        System.out.println(stu.toString());
    }

}
