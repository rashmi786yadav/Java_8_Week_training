package week2;

import java.util.Scanner;

public class CompareTwoString {
    public void CompareStrings() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First String");
        String input1=sc.nextLine();
        System.out.println("Enter the Second String");
        String input2=sc.nextLine();
        if(input1.compareTo(input2)>0){
            System.out.println("First String is greater than second string");
        }
       else if(input1.compareTo(input2)<0){
            System.out.println("Second String is greater than First string");
        }
        else{
            System.out.println("Both strings are same");
        }

    }
    public static void main(String[] args) {
        CompareTwoString compareTwoString=new CompareTwoString();
         compareTwoString.CompareStrings();
    }
}
