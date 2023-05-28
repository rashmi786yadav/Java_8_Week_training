package week3;

import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number of rows");
        int row=sc.nextInt();
        printFloydtriangle(row);
    }

    private static void printFloydtriangle(int row) {
        int rowNumber=0;
        int number=1;
        while(row!=0){
            for(int index=0;index<=rowNumber;index++){
                System.out.print(number++ + " ");
            }
            System.out.println();
            rowNumber++;
            row--;
        }
    }
}
