
package privatenumberphone;


public class Utility {
    public void hidePhoneNumber(){
        String phones = "0987654321, 0123456789, 0905111222";
        String[] parts = phones.split(", ");
        for(String part: parts){
            String text = "*";
            int times = 4;
            String first = part.substring(0, 3);
            String mid = part.substring(3, 7);
            String last = part.substring(7, part.length());
            String hide = mid.replace(mid, text.repeat(times));//Thay the cai vi tri minh muon
            System.out.println(first+hide+last);
        }
    }
}
