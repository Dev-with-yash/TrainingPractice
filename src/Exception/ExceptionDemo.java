package Exception;
import java.util.Scanner;
class InvalidAgeException extends Exception{
    public InvalidAgeException(String msg){
        super(msg);
    }
}
public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try{
            if (age<18){
                throw new InvalidAgeException("Not valid age for voting");
            }
            else{
                System.out.println("You are eligible for voting");
            }
        }catch (InvalidAgeException e){
            System.out.println(e);
        }
    }
}
