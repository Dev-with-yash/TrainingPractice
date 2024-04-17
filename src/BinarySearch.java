import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter elements : ");
        int[] narr= new int[n];
        for (int i = 0; i < n; i++) {
            narr[i] = sc.nextInt();
        }
        System.out.print("Enter search element : ");
        int pivot = sc.nextInt();
        int  low = 0;
        int  high = n-1;

        Arrays.sort(narr);
        while (low < high){
            int mid = (low+high)/2;
           if (pivot < narr[mid]){
               high = mid -1;
           }
           else if (pivot > narr[mid]){
               low = mid + 1;
           }
           else if (pivot == narr[mid]){
               System.out.println("element found ...");
               flag = false;
               break;
           }

        }
        if(flag){
            System.out.println("element not found..");
        }
    }
}
