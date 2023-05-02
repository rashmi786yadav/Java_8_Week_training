package week4;

public class ConstructorOverloading {
    private String name;
    private int age;

    public void Constructor(String name){
        this.name=name;
    }
    public void Constructor(int age){
        this.age=age;
    }
    public void Constructor(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public static void main(String[] args) {
        Constructor object=new Constructor("Rashmi");
        System.out.println(object.getName());
    }
}
