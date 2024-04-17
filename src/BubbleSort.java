import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        //bubble sort algo
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter elements : ");
        int[] nary = new int[n];
        for (int i = 0; i < n; i++) {
            nary[i] = sc.nextInt();
        }

        int temp;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i ; j++) {
                if(nary[j] > nary[j+1]){
                    temp = nary[j+1];
                    nary[j+1] = nary[j];
                    nary[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(nary[i] + " ");
        }

      // 5 7 8 3 2
        // 5 7 8 3 2


    }
}
