package week2;

public class Factorial {
    public void Calculatefactorial(int number) {
       int ans=1;
        while(number!=0){
            ans=ans*number;
            number--;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Factorial factorial=new Factorial();
        factorial.Calculatefactorial(6);
    }
}
// EG:-  5 4 3 2 1 = 120
//       6 5 4 3 2 1 = 720
