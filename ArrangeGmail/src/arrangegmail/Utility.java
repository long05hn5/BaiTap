package arrangegmail;

public class Utility {

    public void arrange() {
        String emails = " user1@GMA ; admin@yahoo.com ; TEST@gmail ; dev@outlook.com ";
        String[] parts = emails.toLowerCase().split(" ; ");
        for (String part : parts) {
            String subPart = part.trim();
            if (subPart.contains("gmail")) {
                subPart = subPart + ".com";
                System.out.println(subPart);
            } else if(subPart.contains("gma")) {
                subPart = subPart + "il.com";
                System.out.println(subPart);
            }else{
                System.out.println(subPart);
            }

        }

    }

}
