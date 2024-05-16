package JavaAssingments16_05.Q1;

public class UserMainCode {
    public static int checksum(int n){

        int sum = 0;
        while(n>0){
            int  r = n%10;
            if (r % 2!=0){
                sum = sum + r;
            }
            n = n/10;
        }
        if (sum % 2 !=0 ){
            return 1;
        }
        else{
            return -1;
        }
    }
}


