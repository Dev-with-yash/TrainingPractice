package JavaAssingments16_05;

import java.util.Scanner;

public class UserMainTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = UserMainCode.checksum(n);
        System.out.println(res);
    }

}
