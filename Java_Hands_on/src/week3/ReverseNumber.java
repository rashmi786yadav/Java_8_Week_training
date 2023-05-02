package week3;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int number=sc.nextInt();
        printNumberInReverse(number);
    }

    private static void printNumberInReverse(int number) {
        while(number!=0){
            System.out.println(number%10);
            number=number/10;
        }
    }

}
