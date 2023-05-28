package com.week5.streamapi;

import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.*;
//find second minimum using stream api
public class SecondMinimum {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(SecondMinimum.class.getName());
        List<Integer>list= takeInput(logger);
        int secondMinimum=list.stream().distinct().sorted().skip(1).findFirst().orElse(-1);
        logger.log(Level.INFO, String.valueOf(secondMinimum));
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
