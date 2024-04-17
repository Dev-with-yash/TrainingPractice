package Day1_3Assignments;
/*
* Create a program that declares an array of integers,
* initializes it with consecutive numbers,
* and prints the array in reverse order.
 */
public class Task4 {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{1,2,3,4,5,6,7};
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
