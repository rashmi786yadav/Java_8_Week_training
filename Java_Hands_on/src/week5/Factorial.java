package week5;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        int number=takeInput();// calling input methode
        int factorial=1;
        factorial=factorialOfNumber(number,factorial);// calling calculatefactorial methode
        System.out.println(factorial);
    }
    private static int takeInput() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to find factorial");
        int number=sc.nextInt();
        return number;

    }
   // recusive function to calculate factorial
    private static int factorialOfNumber(int number,int factorial) {
        if(number==1)return factorial;
        factorial=factorial*number;
        return factorialOfNumber(number-1,factorial);
    }
}
