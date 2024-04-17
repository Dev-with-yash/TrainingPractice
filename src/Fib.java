import java.util.Scanner;

public class Fib {
    public int fibnocci(int n){
        if (n <= 0){
            return -1;
        }
        else if (n==1){
            return 0;
        }
        else if (n==2){
            return 1;
        }
        else{
            int a = 0;
            int b = 1;
            int c;
            for(int i = 2; i<n; i++){
                c = a+b;
                a = b;
                b = c;
            }
            return b;
        }
    }
    public static void main(String[] args) {
       Fib f = new Fib();
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the n: ");
       int n = sc.nextInt();
       System.out.println(f.fibnocci(n));
    }
}
