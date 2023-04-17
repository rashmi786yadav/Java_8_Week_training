package week2;

import java.util.Scanner;

public class StarProgram {
    public static void main(String[] args) {
        int row;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of row ");
        row=sc.nextInt();
        int n=5;
        for(int i=1;i<=row;i++){
            n=5;
            while(n!=0){
            System.out.print("*");
            n--;
            }
            System.out.println();
        }
    }
}
