package week5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list=takeInput(list);// input methode
        list=bubbleSort(list);// calling bubble sort methode to sort list in ascending order
        printList(list);// caling methode to print sorted list
    }
    private static List<Integer> bubbleSort(List<Integer> list) {
        int n = list.size();
        for (int index1 = 0; index1 < n-1; index1++) {
            for (int index2 = 0; index2 < n-index1-1; index2++) {
                if (list.get(index2) > list.get(index2+1)) {
                    int temp = list.get(index2);
                    list.set(index2, list.get(index2+1));
                    list.set(index2+1, temp);
                }
            }
        }
        return list;
    }
    private static void printList(List<Integer> list) {
        for(int index=0;index<list.size();index++){
            System.out.println(list.get(index));
        }
    }
    private static List<Integer> takeInput(List<Integer> list) {
        Scanner sc=new Scanner(System.in);
        int number;
        for(int index=0;index<10;index++) {
            System.out.println("enter the number");
            number = sc.nextInt();
            list.add(number);
        }
        return list;
    }
}
