package classfication;

//Dữ liệu đầu vào: String data = "J1a2v3a4C5o6r7e";
import java.util.Scanner;

//Chuỗi chữ: JavaCore
//Chuỗi số: 1234567
public class Utility {

    public void classfication() {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        String chu = "";
        String so = "";
        for (char input : data.toCharArray()) {//.toCharArray() Chuyển chuỗi này thành một mảng ký tự mới
            switch (input) {
                case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9':
                    so = so + input;
                    break;
                default:
                    chu = chu + input;
                    break;
            }
        }
        System.out.println("Chuỗi số:" + chu);
        System.out.println("Chuỗi chữ:" + so);
    }
}
//String orders = "DH01-Laptop-1500|DH02-Chuột-20|DH03-Bàn phím-50"
//Đơn hàng 1: Mã = DH01, Tên = Laptop, Giá = 1500
//Đơn hàng 2: Mã = DH02, Tên = Chuột, Giá = 20
//Đơn hàng 3: Mã = DH03, Tên = Bàn phím, Giá = 50