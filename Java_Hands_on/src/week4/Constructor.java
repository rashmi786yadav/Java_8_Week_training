package week4;

public class Constructor {
    private String name;
    public Constructor(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public static void main(String[] args) {
        Constructor object=new Constructor("Rashmi");
        System.out.println(object.getName());
    }
}
// logger ,package name ,