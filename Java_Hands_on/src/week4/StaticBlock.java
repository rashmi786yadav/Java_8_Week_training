package week4;
public class StaticBlock {
    private static void PrintNumber(int number) {

        if(number>10)return;
        System.out.println(number);
        PrintNumber(number+1);
    }
    static{
        System.out.println("I am static block");
    };
    public static void main(String[] args) {
        PrintNumber(1);
    }
}
