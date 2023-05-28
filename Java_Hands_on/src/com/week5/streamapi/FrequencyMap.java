package com.week5.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

//this class is used for creating a frequncy map using stream api
public class FrequencyMap {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(FrequencyMap.class.getName());
        List<Integer> list=new ArrayList<>();
        list=takeInput(logger);
        Map<Integer,Long> map=list.stream().collect(Collectors.groupingBy(
                number->number,
                Collectors.counting()
        ));
        logger.log(Level.INFO, map.toString());
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
