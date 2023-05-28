package com.week5.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
//class to calculate sum of all even number square
public class SquareSumOfEvenNumbers {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(SquareSumOfEvenNumbers.class.getName());
        List<Integer> list=new ArrayList<>();
        list=takeInput(logger);
        int sum=list.stream().filter(number->number%2==0).mapToInt(number->number*number).sum();
        logger.log(Level.INFO, String.valueOf(sum));
    }
    // this methode will take input to the list
    private static List<Integer> takeInput(Logger logger) {
        List<Integer>list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("how many element you want to add in add");
        int size=sc.nextInt();
        for(int index=0;index<size;index++){
            logger.log(Level.INFO, "Enter the number");
            int number=sc.nextInt();
            list.add(number);
        }
        return list;
    }
}
