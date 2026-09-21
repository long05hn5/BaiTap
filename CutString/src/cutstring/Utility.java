package cutstring;

public class Utility {

    public void parameterClassification() {
        String url = "https://example.com/api/users?role=admin&status=active&page=2";
        String position = url.substring(url.indexOf("?")+1, url.length());
        String[] parts = position.split("&");
        String parameter = "";
        String value = "";
        for(String part : parts){
            String[] subPart = part.split("=");
            for(String sub : subPart){
                 parameter = subPart[0];
                 value = subPart[1];
                
            }
            System.out.println("Tham số: " +parameter +"->"+"Gía trị: "+value);
        }
    }

}
