package week3;

import java.util.Scanner;

public class Substrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String string=sc.nextLine();
        printAllSubstring(string);
    }

    private static void printAllSubstring(String string) {
        for(int index1=0;index1<string.length();index1++){
            String substring="";
            for(int index2=index1;index2<string.length();index2++){
                substring+=string.charAt(index2);
                System.out.println(substring+" ");
            }
        }
    }
}
