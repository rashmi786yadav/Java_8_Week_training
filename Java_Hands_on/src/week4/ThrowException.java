package week4;

public class ThrowException {
    public static void main(String[] args) throws Exception {
        validateStudent(2);
    }
    private static void validateStudent(int age) throws Exception {
        if(age<5){
            throw new Exception("Student is not eligible for addmission");
        }else{
            System.out.println("student is eligible for addmission");
        }
    }
}
