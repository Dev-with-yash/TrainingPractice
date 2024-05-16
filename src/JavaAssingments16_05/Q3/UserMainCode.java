package JavaAssingments16_05.Q3;

public class UserMainCode {

    public static int reverseNumber(int n) {
        int rv = 0;
        while(n>0){
           int r = n % 10;
            rv = rv * 10 + r;
            n /= 10;

        }
        return rv;
    }
}
