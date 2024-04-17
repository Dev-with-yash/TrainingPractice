import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        int n =  sc.nextInt();
        int[] narr = new int[n];
        for (int i = 0; i < n; i++) {
            narr[i] = sc.nextInt();
        }
        System.out.print("enter the search element: ");
        int pivot = sc.nextInt();
        for (int i = 0; i < n ; i++) {
            if(narr[i] == pivot) {
                System.out.println("element found .... ");
                flag = false;
            }
        }
        if(flag){
            System.out.println("element not found");
        }
    }
}
