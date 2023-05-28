package week3;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int number=sc.nextInt();
        checkpalindrome(number);
    }

    private static void checkpalindrome(int number) {
        int newNumber=0;
        int temp=number;
        while(temp!=0){
            newNumber=newNumber*10+temp%10;
            temp=temp/10;
        }
        if(newNumber==number) System.out.println("Given number is palindrome");
        else System.out.println("given number is not palindrome");
    }
}
