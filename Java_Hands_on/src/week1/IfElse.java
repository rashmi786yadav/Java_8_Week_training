package week1;
public class IfElse {
    public static void main(String[] args) {
        
        int no=10;
        if(no>0){
            System.out.println("no if Positive");
        }else if(no==0){
            System.out.println("no is zero");
        }
        else{
            System.out.println("no is negative");
        }

// nested if else

int num=20;

if(num>0){
    if(num%2==0){
        System.out.println("given no is positive and even");
    }else{
        System.out.println("given no is positive nut not even");
    }
}else if(num==0){
    System.out.println("given no is zero");
}
else{
    if(num%2==0){
        System.out.println("given no is negative and even");
    }else{
        System.out.println("given no is negative but not even");
    }
}

    }
}
