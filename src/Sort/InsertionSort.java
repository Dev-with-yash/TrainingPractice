package Sort;



public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = new int[]{3,6,2,8,7};
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i-1;
            while(j >= 0 && temp <= arr[j]){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = temp;
        }
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
