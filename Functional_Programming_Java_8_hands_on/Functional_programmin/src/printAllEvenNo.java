import java.util.*;
public class printAllEvenNo {
    public static void main(String[] args) {
        List<Integer>nums=List.of(1,2,3,4,5,6,7,8,9);
        nums.stream().filter(x->x%2==0).forEach(System.out::println);
        }
}
