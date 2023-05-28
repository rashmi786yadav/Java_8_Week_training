import java.util.*;
import java.util.stream.Collectors;
public class collectsquareofno {
    public static void main(String[] args) {
        List<Integer>nums=List.of(1,2,3);
         List<Integer>ans=nums.stream().map(x->x*x).collect(Collectors.toList());
         System.out.println(ans);
        
        }
}
