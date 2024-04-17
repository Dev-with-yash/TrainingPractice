package Day1_3Assignments;

public class Task6 {

    int sum = 0;
    public int SumArray(int[] arr){
        return SumOfArray(arr,0);
    }

    private static int SumOfArray(int[] arr, int i) {
        if (i==arr.length){
            return 0;
        }
        return arr[i]+SumOfArray(arr,i+1);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4};
        Task6 ab = new Task6();
        int sum = ab.SumArray(arr);
        System.out.println(sum);
    }
}
