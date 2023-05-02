package week5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list = takeInput(list);// methode to take input into list
        binarySearch(list, 11);// methode for binary search
    }

    private static void binarySearch(List<Integer> list, int key) {
        boolean flag = false;
        int left = 0, right = list.size() - 1;
        while (left < right) {
            int mid = left + right / 2;
            if (list.get(mid) == key) {
                System.out.println("Given Key is present in list");
                flag = true;
                break;
            } else if (key > list.get(mid)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (!flag ) System.out.println("Key is not present in list");
    }

    private static List<Integer> takeInput(List<Integer> list) {
        Scanner sc = new Scanner(System.in);
        int number;
        for (int index = 0; index < 10; index++) {
            System.out.println("enter the number");
            number = sc.nextInt();
            list.add(number);
        }
        return list;
    }
}
