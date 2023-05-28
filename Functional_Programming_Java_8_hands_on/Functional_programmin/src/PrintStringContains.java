import java.util.*;
public class PrintStringContains {
    public static void main(String[] args) {
        List<String>nums=List.of("spring", "string1","springRashmi");
    
        nums.stream().filter(x->x.contains("spring")).forEach(System.out::println);
        }
}
