package week1;
public class SwapTwoNo {
    public static void main(String[] args) {
        int no1=10;
        int no2=20;

        int temp;
        temp=no1;
        no1=no2;
        no2=temp;
        System.out.println(no1);
        System.out.println(no2);


        /// swap no without using third variable


        int num1=100;
        int num2=200;

        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println(num1);
        System.out.println(num2);

    }
}
