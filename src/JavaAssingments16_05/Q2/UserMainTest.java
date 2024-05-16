package JavaAssingments16_05.Q2;


import java.util.Scanner;

public class UserMainTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();
        int sum = UserMainCode.sumOfSquaresOfEvenDigits(n);
        System.out.println(sum);
    }
}
