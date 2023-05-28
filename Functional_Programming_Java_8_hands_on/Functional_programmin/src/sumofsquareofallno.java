import java.util.*;
public class sumofsquareofallno {
    public static void main(String[] args) {
        List<Integer>nums=List.of(1,2,3);
         int ans= nums.stream().map(x->x*x).reduce(0,(a,b)->a+b);
         System.out.println(ans);
        }
}
