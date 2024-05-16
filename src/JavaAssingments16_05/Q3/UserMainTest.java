package JavaAssingments16_05.Q3;



import java.util.Scanner;

public class UserMainTest {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to reverse : ");
    int n = sc.nextInt();
    int res = UserMainCode.reverseNumber(n);
        System.out.println(res);

    }

}
