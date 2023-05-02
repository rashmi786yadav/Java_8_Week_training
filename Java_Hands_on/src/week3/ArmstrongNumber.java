package week3;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int number=sc.nextInt();
        checkArmstrongNumber(number);

    }

    private static void checkArmstrongNumber(int number) {
        int temp=number;
        int digit=0;
        int sum=0;
        while(temp!=0){
            digit++;
            temp=temp/10;
        }
        temp=number;
        while(temp!=0){
            int remainder=temp%10;
            sum+=Math.pow(remainder,digit);
            temp=temp/10;
        }
       if(sum==number) System.out.println("Given Number is Armstrong");
       else System.out.println("Given Number is not Armstrong");
    }
}
