package week2;

public class PrimeNumber {
    public static void main(String[] args) {
        PrimeNumber primeNumber=new PrimeNumber();
        primeNumber.CheckPrime(15);
    }

    private void CheckPrime(int number) {
        int flag=0;
        for(int i=2;i<=Math.sqrt(number);i++){  
            if(number%i==0){
                System.out.println("not a prime");
                flag=1;
                break;
            }
        }
        if(flag==0)
        System.out.println("given number is prime number");
    }
}
