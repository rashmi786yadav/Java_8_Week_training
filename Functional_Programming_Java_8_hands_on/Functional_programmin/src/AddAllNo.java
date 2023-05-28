import java.util.*;
public class AddAllNo {
    public static void main(String[] args) {
        List<Integer>nums=List.of(1,2,3,4,5);
         int ans= nums.stream().reduce(0,(a,b)->a+b);
         System.out.println(ans);
        }
}
