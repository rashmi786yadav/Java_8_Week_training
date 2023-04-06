import java.util.ArrayList;
import java.util.List;

public class LargestNo {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        int maximumNo=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            maximumNo=Math.max(maximumNo,list.get(i));
        }
        System.out.println(maximumNo);
    }
}
