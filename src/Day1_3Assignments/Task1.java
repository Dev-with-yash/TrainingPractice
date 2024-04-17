package Day1_3Assignments;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        System.out.println("enter two variables a and b:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a+" "+b);

    }
}
