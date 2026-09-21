package classficationobject;

public class Order {

    String code, name;
    double price;

    public Order() {
    }

    public Order( String code, String name, double price) {
 
        this.code = code;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return " Mã = " + code + ", Tên = " + name + ", Giá = " + price;
    }
    
    public boolean validPrice(){
        try{
            if(this.price > 0){
                return true;
            }
        }catch(NumberFormatException e){
        }
        return false;
    }
}
