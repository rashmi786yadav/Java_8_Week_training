package week3;

import java.util.ArrayList;
import java.util.List;

public class SplitString {
    public static void main(String[] args) {
        String string="Hello:Everyone:i:am:learning Java";

        String[] list=string.split(":");
        for(String str:list) System.out.println(str);
    }
}
