package week2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WhileLoopBreak {
    public static void main(String[] args) {
        // print all Number from List if every number is even ,if any odd no found break the loop
        List<Integer>list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=5;i++){
            System.out.println("please enter the number");
            int number=sc.nextInt();
            list.add(number);
        }
        int size=list.size();
        int index=0;
        while(size!=0){
            if(list.get(index)%2==1){
                break;
            }
            System.out.println(list.get(index));
            index++;
            size--;

        }
    }
}
