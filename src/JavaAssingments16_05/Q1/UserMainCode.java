package JavaAssingments16_05;

public class UserMainCode {
    public static int checksum(int n){
        int r = 0;
        int sum = 0;
        while(n>0){
            r = n%10;
            sum = sum + r;
            n = n/10;
        }
        if (sum % 2 !=0){
            return 1;
        }
        else{
            return -1;
        }
    }
}


