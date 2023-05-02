package week5;

import java.net.URL;
public class GetUrl {
    public static void main(String[] args) {
        try{
            URL url=new URL("https://www.facebook.com/feed");
            System.out.println("Protocol: "+url.getProtocol());
            System.out.println("Host Name: "+url.getHost());
            System.out.println("Port Number: "+url.getPort());
            System.out.println("File Name: "+url.getFile());
        }catch(Exception exp) {System.out.println(exp);}
    }
}
