package week4;

public class ExceptionHandling {
    public static void main(String[] args) {
        try{
            int number=10/0;
        }catch (ArithmeticException exp){
            System.out.println(exp);
        }
        System.out.println("rest of code after exception");
    }
}
