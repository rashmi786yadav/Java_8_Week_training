import java.util.*;
public class squareofeachno {
    public static void main(String[] args) {
        List<Integer>nums=List.of(1,2,3,4,5,6,7,8,9);
        nums.stream().map(x->x*x).forEach(System.out::println);
        }
    }
