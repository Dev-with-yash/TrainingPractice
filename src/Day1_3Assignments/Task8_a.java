package Day1_3Assignments;

import java.util.Scanner;

public class Task8_a {
    public static int[] SliceArray(int[] arr, int start, int end){
        int[] narr = new int[arr.length];
        if (end + 1 - start >= 0)
            System.arraycopy(arr, start, narr, start, end + 1 - start);
        return narr;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8};
        System.out.println("enter start index: ");
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int[] narr =SliceArray(arr,start,end);
        for (int j : narr) {
            if (j != 0) {
                System.out.print(j + " ");
            }
        }
    }
}
