package week4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LenearSearch {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the the key to be search");
        int key=sc.nextInt();
        Search(list,key);
    }
    private static void Search(List<Integer> list, int key) {
        int flag=0;
        for(int index=0;index<list.size();index++){
            if(list.get(index)==key){
                flag=1;
                System.out.println("key is present");
                break;
            }
        }
        if(flag==0) System.out.println("Key is not present");
    }
}
