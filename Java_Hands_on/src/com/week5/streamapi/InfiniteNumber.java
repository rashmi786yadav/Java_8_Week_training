package com.week5.streamapi;

import java.util.logging.Level;
import java.util.stream.Stream;
//this class is for to generate infinite numbers but print only 10 number
public class InfiniteNumber {
    public static void main(String[] args) {
        Stream<Integer> infiniteStream = Stream.iterate(1, n -> n + 1);
        infiniteStream.limit(10)
                .forEach(System.out::println);
    }
}
