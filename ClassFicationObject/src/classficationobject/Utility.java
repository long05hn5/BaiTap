package classficationobject;

import java.util.ArrayList;
import java.util.List;

public class Utility {

    public List<Order> orders;

    public Utility() {
        orders = new ArrayList<>();
    }

    public void classfication() {
        String orders = "DH01-Laptop-1500|DH02-Chuột-20|DH03-Bàn phím-50";
        String[] parts = orders.split("\\|");
        Order order = null;
        for (String part : parts) {  
            String[] subPart = part.split("-");
            if (subPart.length >= 3 ) {
                String code = subPart[0];
                String name = subPart[1];
                String price = subPart[2];
                Order od = new Order(code,name,Double.parseDouble(price));
                this.orders.add(od);
            }           
        }
    }
    
    public void printList(){
        for(int i = 0; i < orders.size(); i++){
            System.out.println(orders.get(i).toString());
        }
    }

}

//   Scanner sc = new Scanner(System.in);
//        String orders = sc.nextLine();
//        String[] parts = orders.split("\\|");//Tach phan tu khoi "/"
//        int id = 0;
//        for (String part : parts) {
//            String[] subPart = part.split("-");//Tach phan tu khoi "-"
//            if (subPart.length >= 3) {
//                String ma = subPart[0];
//                String ten = subPart[1];
//                String gia = subPart[2];
//                id++;
//                System.out.println("Đơn hàng " + id +":" + " Mã = " + ma + ", Tên = " + ten + ", Giá = " + gia);
//            }
//
//        }
//String orders = "DH01-Laptop-1500|DH02-Chuột-20|DH03-Bàn phím-50"
//Đơn hàng 1: Mã = DH01, Tên = Laptop, Giá = 1500
//Đơn hàng 2: Mã = DH02, Tên = Chuột, Giá = 20
//Đơn hàng 3: Mã = DH03, Tên = Bàn phím, Giá = 50
